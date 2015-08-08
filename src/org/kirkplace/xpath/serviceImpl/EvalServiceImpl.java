package org.kirkplace.xpath.serviceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.kirkplace.xpath.service.EvalService;
import org.kirkplace.xpath.util.XmlAdapter;

@Produces("application/json; charset=UTF-8")
public class EvalServiceImpl extends BaseService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private EvalService eval;
	private XmlAdapter resp;
	
	@POST
	@Path("/evaluateXpathExpression")
	public Response evaluateXpathExpr(@Context HttpServletRequest request,
			@Context HttpServletResponse response){
		
		/*
		 * TODO: Extract xpath and document and pass their string representations. Handle exception.
		 */
		return Response.ok(resp.nodeListResponse(eval.evaluateXpathExpr("expression", "document"))).build();
	}
	
}
