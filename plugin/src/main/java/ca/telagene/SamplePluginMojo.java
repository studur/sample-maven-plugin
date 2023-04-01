package ca.telagene;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Maven Mojo for development testing
 */
@Mojo(name = "execute", defaultPhase = LifecyclePhase.TEST)
public class SamplePluginMojo extends AbstractMojo {
  private static final Logger logger = LoggerFactory.getLogger(SamplePluginMojo.class);

  @Parameter(property = "stringToLog")
  String stringToLog;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    final String toLog = stringToLog == null ? "nothing" : stringToLog;
    logger.warn("Logging {}", toLog);
  }
}
