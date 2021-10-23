package io.quarkus.lastbench;

import io.quarkus.panache.common.Sort;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ToDoResource {

    @GET
    //public List<ToDo> getAllTodo(){
    public String getAllTodo(){
        return "Yet to be added!!";
        //return ToDo.listAll(Sort.by("order"));
    }
}
