package io.swagger.api;

import io.swagger.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/")
@Api(value = "/", description = "")
public interface AuthApi  {

    @POST
    @Path("/auth")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "authorization", tags={  })
    public InlineResponse200 authPost(@HeaderParam("Authorization") String authorization);

    @POST
    @Path("/v2/auth")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "authorization", tags={  })
    public InlineResponse200 v2AuthPost(@HeaderParam("Authorization") String authorization);
}

