package io.swagger.api;

import io.swagger.model.InlineResponse201;
import io.swagger.model.LegalReason;
import io.swagger.model.ProcessScenario;

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
public interface LegalReasonApi  {

    @POST
    @Path("/taxconf/legal-reason")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Legal Reason.", tags={  })
    public InlineResponse201 createReason_(LegalReason body);

    @DELETE
    @Path("/taxconf/legal-reason/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a Legal Reason entry.", tags={  })
    public  deleteReason_(@PathParam("uuid") String uuid);

    @GET
    @Path("/taxconf/legal-reason/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get single Legal Reason.", tags={  })
    public ProcessScenario getReason_(@PathParam("uuid") String uuid);

    @GET
    @Path("/taxconf/legal-reason")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "List Legal Reasons.", tags={  })
    public List<List<LegalReason>> listReason(@QueryParam("companyId")String companyId);

    @PUT
    @Path("/taxconf/legal-reason")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Legal Reason.", tags={  })
    public  updateReason_(LegalReason body);
}

