package org.kirkplace.xpath.serviceImpl;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.kirkplace.xpath.service.EvalService;

@Produces("application/json; charset=UTF-8")
public class EvalServiceImpl extends BaseService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private EvalService eval;
	
	@GET
	@Path("/evaluateXpathExpression")
	public Response evaluateXpathExpr(){
		
		
		return null;
	}
	
}
