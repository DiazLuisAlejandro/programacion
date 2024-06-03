package es.ies.puerto.service.interfaces;

import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.exception.MarvelException;

import javax.ws.rs.PathParam;
import javax.xml.ws.Response;

public interface ICrudAliasService {
    Response getObjectByID(@PathParam("id") String id)throws MarvelException;
    public Response getAll() throws MarvelException;
    public Response addObject(AliasDto aliasDto) throws MarvelException;
    public Response deleteObjectByID(@PathParam("id")String id)throws MarvelException;
}
