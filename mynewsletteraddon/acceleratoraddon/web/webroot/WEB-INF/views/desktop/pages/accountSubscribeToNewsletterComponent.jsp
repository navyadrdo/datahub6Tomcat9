<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>

<div class="basicblock col-md-12 col-xs-12 col-sm-12">
	<div class="basicblock_paddinger">

		<form:form action="/my-account/newsletter" method="post"
			class="form-horizontal row_topmargin">
			<div class="col-sm-12 col-xs-12 col-md-12">
				<div class="form-group">
					<div class="col-sm-12 col-xs-12 col-md-9">
						<div class="checkbox">
							<label> <input type="checkbox"
								name="subscribeToNewsletter" id="subscribeToNewsletter" value="true"
							<%-- 	${subscribeToNewsletter == 'true' ? 'checked' : ''} --%>>
								Feliratkozom a hírlevélre
							</label>
						</div>

					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-success">
				<i class="fa fa-save"></i> BEÁLLÍTÁS ELMENTÉSE
			</button>
		</form:form>


	</div>

</div>
</div>
