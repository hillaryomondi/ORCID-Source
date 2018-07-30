<#import "email_macros.ftl" as emailMacros />
<#escape x as x?html>
<!DOCTYPE html>
<html>
	<head>
	<title>${subject}</title>
	</head>
	<body>
		<div style="padding: 20px; padding-top: 0px;">
			<img src="https://orcid.org/sites/all/themes/orcid/img/orcid-logo.png" alt="ORCID.org"/>
		    <hr />
		  	<span style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666; font-weight: bold;">
			    <@emailMacros.msg "email.common.dear" /><@emailMacros.space />${emailName}<@emailMacros.msg "email.common.dear.comma" />
		    </span>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
                <@emailMacros.msg "email.api_record_creation.creaded_an_account.1" />${creatorName}<@emailMacros.space /><@emailMacros.msg "email.api_record_creation.creaded_an_account.2" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		        <@emailMacros.msg "email.api_record_creation.what" />
 		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">		  
				<@emailMacros.msg "email.api_record_creation.within.1" /><@emailMacros.space />${creatorName}<@emailMacros.space /><@emailMacros.msg "email.api_record_creation.within.2" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		  		<a href="${verificationUrl}?lang=${locale}">${verificationUrl}</a>
		    </p>		    
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		        <@emailMacros.msg "email.api_record_creation.what_happens" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		        <@emailMacros.msg "email.api_record_creation.if_you_take_no.1" /><@emailMacros.space />${creatorName}<@emailMacros.space /><@emailMacros.msg "email.api_record_creation.if_you_take_no.2" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		       <@emailMacros.msg "email.api_record_creation.what_is_orcid" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		       <@emailMacros.msg "email.api_record_creation.launched.1" /><a href="${baseUri}/home?lang=${locale}">${baseUri}/</a><@emailMacros.msg "email.api_record_creation.launched.2" />
		    </p>
		    <p style="font-family: arial, helvetica, sans-serif; font-size: 15px; color: #666666;">
		        <@emailMacros.msg "email.api_record_creation.read_privacy.1" /><@emailMacros.space />
		        <a href="${baseUri}/privacy-policy/?lang=${locale}">${baseUri}/privacy-policy/</a><@emailMacros.msg "email.api_record_creation.read_privacy.2" /><@emailMacros.msg "email.common.if_you_have_any1" /> <a href="<@emailMacros.msg "email.common.need_help.description.2.href" />"><@emailMacros.msg "email.common.need_help.description.2.href" /></a><@emailMacros.msg "email.common.if_you_have_any2" />
		    </p>
		  	<p style="font-family: arial,  helvetica, sans-serif;font-size: 15px;color: #666666; white-space: pre;">
<@emailMacros.msg "email.common.kind_regards" />
			</p>
			<p style="font-family: arial,  helvetica, sans-serif;font-size: 15px;color: #666666;">
				<a href="${baseUri}/home?lang=${locale}">${baseUri}/<a/>
			</p>
			<p style="font-family: arial,  helvetica, sans-serif;font-size: 15px;color: #666666;">
				<@emailMacros.msg "email.common.you_have_received_this_email" />
			</p>
			<p style="font-family: arial,  helvetica, sans-serif;font-size: 15px;color: #666666;">
			   <#include "email_footer_html.ftl"/>
			</p>
		 </div>
	 </body>
 </html>
 </#escape>
