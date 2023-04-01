package ca.telagene.exception;

import org.apache.maven.plugin.MojoFailureException;

public class SampleMojoFailureException extends MojoFailureException {

  public SampleMojoFailureException(final String message) {
    super(message);
  }
}
