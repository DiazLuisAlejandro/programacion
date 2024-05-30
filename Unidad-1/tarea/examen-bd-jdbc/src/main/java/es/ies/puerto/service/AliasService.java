package es.ies.puerto.service;

import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.IMapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.service.interfaces.ICrudAliasService;

import javax.ws.rs.*;
import javax.xml.ws.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService implements ICrudAliasService {


    @GET
    @Path("/{id}")
    @Override
    public Response getObjectByID(String id) throws MarvelException {
        return null;
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        return null;
    }

    @POST
    @Override
    public Response addObject(AliasDto aliasDto) throws MarvelException {
        return null;
    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectByID(String id) throws MarvelException {
        return null;
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Alias alias = IMapperAlias.INSTANCE.aliasDtoToAlias(new AliasDto(id));
        Alias aliasFind = DaoAlias.findAlias(alias);

        if (aliasFind != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
