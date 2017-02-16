package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.Message;
import io.swagger.model.ValidationError;

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
public interface CompanyFilesApi  {

    @DELETE
    @Path("/companies/{companyId}/nfse-certificate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  companiesCompanyIdNfseCertificateDelete(@PathParam("companyId") String companyId, @PathParam("companyId") String companyId2);

    @GET
    @Path("/companies/{companyId}/nfse-certificate")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={  })
    public  companiesCompanyIdNfseCertificateGet(@PathParam("companyId") String companyId, @PathParam("companyId") String companyId2, @QueryParam("peek")BigDecimal peek);

    @POST
    @Path("/companies/{companyId}/nfse-certificate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public InlineResponse2002 companiesCompanyIdNfseCertificatePost(@PathParam("companyId") String companyId, Body3 body);

    @PUT
    @Path("/companies/{companyId}/nfse-certificate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public InlineResponse2002 companiesCompanyIdNfseCertificatePut(@PathParam("companyId") String companyId, @PathParam("companyId") String companyId2, Body2 body);
}

