package io.github.jorgefilho.swagger.resource;

import io.github.jorgefilho.swagger.resource.constants.ResourcePath;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(ResourcePath.API)
public class ServiceApplication extends Application{}
