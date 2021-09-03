package com.kainos.ea;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Configuration settings for the JobSystemApplication.
 */
public class JobSystemConfiguration extends Configuration {
  @Valid
  @NotNull
  private DataSourceFactory dataSourceFactory = new DataSourceFactory();

  @JsonProperty("database")
  public DataSourceFactory getDataSourceFactory() {
    return dataSourceFactory;
  }

  private SwaggerBundleConfiguration swagger;

  public SwaggerBundleConfiguration getSwagger() {
    return swagger;
  }

  public void setSwagger(SwaggerBundleConfiguration swagger) {
    this.swagger = swagger;
  }
}

