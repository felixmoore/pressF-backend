package com.kainos.ea;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.resources.JobRolesResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.jdbi.v3.core.Jdbi;

/**
 * Initialises and runs the API service.
 */
public class JobSystemApplication extends Application<JobSystemConfiguration> {

  public static void main(final String[] args) throws Exception {
    // "server config.yml" should be in args
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
    final JdbiFactory factory = new JdbiFactory();
    final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
    environment.jersey().register(new JobRolesResource(jdbi.onDemand(JobRolesDAO.class)));

  }

}
