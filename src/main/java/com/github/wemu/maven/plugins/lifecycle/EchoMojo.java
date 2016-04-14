package com.github.wemu.maven.plugins.lifecycle;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "echo")
public class EchoMojo extends AbstractMojo {

    @Parameter(defaultValue = "${mojoExecution}", readonly = true)
    private MojoExecution execution;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        String lifecyclePhase = execution.getLifecyclePhase();
        getLog().info("Echo is running in phase: " + lifecyclePhase);
    }
}
