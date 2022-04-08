package plugin;

import org.apache.commons.lang3.SystemUtils;
import org.apache.maven.model.Developer;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import javax.xml.xpath.XPath;
import java.awt.*;
import java.nio.file.Files;

/**
 *
 */

@Mojo(name="version",defaultPhase = LifecyclePhase.INITIALIZE)
public class TestMojo  extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Java Version: "+System.getProperty("java.version"));
        getLog().info("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        getLog().info("Java Home: " + System.getProperty("java.home"));
        getLog().info("Java Vendor: " + System.getProperty("java.vendor"));
        getLog().info("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        getLog().info("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }
}
