package com.kainos.ea;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
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
}

