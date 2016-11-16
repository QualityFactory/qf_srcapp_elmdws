package br.com.qualityfactory.el.elmdws.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.qualityfactory.el.elifr.vo.Response;
import br.com.qualityfactory.el.elifr.vo.Token;
import br.com.qualityfactory.el.elifr.vo.request.CodestRequest;

@Controller
@Path("codest")
public class CodestController {

	@Inject
	private Result result;

	@Post("listAll")
	@Consumes("application/json")
	public void listAll(CodestRequest request) {
		Response response = new Response();

		// TODO - Quem deve gerar o token é a camada de infraestrutura elifr
		Token token = null;

		// TODO - Obter response da camada de RN elmd
		response.setResponse(null);

		result.use(Results.json()).withoutRoot().from(response).include("response").recursive().serialize();
	}

	@Post("findByParam")
	@Consumes("application/json")
	public void findCodestWithArguments(CodestRequest request) {
		Response response = new Response();

		// TODO - Quem deve gerar o token é a camada de infraestrutura elifr
		Token token = null;

		// TODO - Obter response da camada de RN elmd
		response.setResponse(null);
	}
}
