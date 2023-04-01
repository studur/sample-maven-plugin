package ca.telagene;

import ca.telagene.exception.SampleMojoExecutionException;
import ca.telagene.exception.SampleMojoFailureException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * A Maven Mojo for development testing
 */
@Mojo(name = "execute", defaultPhase = LifecyclePhase.TEST)
public class SamplePluginMojo extends AbstractMojo {

  @Parameter(property = "stringToLog", defaultValue = "")
  String stringToLog;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    if (stringToLog == null) {
      throw new SampleMojoExecutionException("String to log is null");
    }
    if (stringToLog.equalsIgnoreCase("fail")) {
      throw new SampleMojoFailureException("String is set to FAIL");
    }
    getLog().info("Logging " + stringToLog);
  }
}
