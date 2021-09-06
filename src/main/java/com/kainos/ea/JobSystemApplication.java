package com.kainos.ea;


import com.kainos.ea.authentication.UserAuthenticator;
import com.kainos.ea.authentication.UserAuthoriser;
import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.db.SessionDAO;
import com.kainos.ea.db.UserDAO;
import com.kainos.ea.objects.User;
import com.kainos.ea.resources.JobRolesResource;
import com.kainos.ea.resources.SessionResource;
import com.kainos.ea.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.eclipse.jetty.server.session.SessionHandler;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.jdbi.v3.core.Jdbi;

/**
 * Initialises and runs the API service.
 */
public class JobSystemApplication extends Application<JobSystemConfiguration> {

  public static void main(final String[] args) throws Exception {
    // "server src/main/resources/config.yml" should be in args
    new JobSystemApplication().run(args);
  }

  @Override
  public String getName() {
    return "JobSystem";
  }

  @Override
  public void initialize(Bootstrap<JobSystemConfiguration> bootstrap) {
    bootstrap.addBundle(new SwaggerBundle<>() {
      @Override
      protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(JobSystemConfiguration configuration) {
        return configuration.getSwagger();
      }
    });
  }


  @Override
  public void run(final JobSystemConfiguration configuration,
                  final Environment environment) {
    // Registering DB factory
    final JdbiFactory factory = new JdbiFactory();
    final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
    // Registering API endpoints
    environment.jersey().register(new JobRolesResource(jdbi.onDemand(JobRolesDAO.class)));
    environment.jersey().register(new UserResource(jdbi.onDemand(UserDAO.class)));
    environment.jersey().register(new SessionResource(jdbi.onDemand(SessionDAO.class)));
    // Registering authentication & authorisation
    environment.jersey().register(new AuthValueFactoryProvider.Binder<>(User.class));
    environment.jersey().register(new AuthDynamicFeature(
        new BasicCredentialAuthFilter.Builder<User>()
            .setAuthenticator(new UserAuthenticator(jdbi.onDemand(UserDAO.class)))
            .setAuthorizer(new UserAuthoriser())
            .setRealm("PROTECTED-REALM")
            .buildAuthFilter()));
    environment.jersey().register(RolesAllowedDynamicFeature.class);
  }

}
