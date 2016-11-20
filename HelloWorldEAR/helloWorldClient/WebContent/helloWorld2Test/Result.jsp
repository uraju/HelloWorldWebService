<%@page contentType="text/html;charset=UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
com.ibm.ccl.ws.jaxws.gstc.util.OutputUtils.init(session);

boolean async       = session.getAttribute("__async__") == null ? false : true;
String methodKey    = request.getParameter("key");
String resultSuffix = methodKey != null && methodKey.length() > 0 ? " - " + methodKey : "";
%>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
<LINK rel="stylesheet" type="text/css" href="TestClient.css"/>
<script language="JavaScript">

function reloadMethods() {
    window.parent.frames["methods"].location.reload(true);
}
</script>
</HEAD>
<BODY>
<TABLE class="heading" width="100%">
<TR><TD>Result<%= org.eclipse.jst.ws.util.JspUtils.markup(resultSuffix) %></TD></TR>
</TABLE>
<P>
<jsp:useBean id="sampleHelloWorld2PortProxyid" scope="session" class="org.acme.ws.next.HelloWorld2PortProxy" />

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

boolean isDone = true;
try {
    String sourceInTemp = request.getParameter("__rawxml__");
        javax.xml.transform.Source sourceIn  = sourceInTemp != null ?
            new javax.xml.transform.stream.StreamSource(new java.io.ByteArrayInputStream(sourceInTemp.getBytes())) : null;
    javax.xml.transform.Source sourceOut = null;

    boolean bypass = (sourceIn != null);

switch (methodID){ 
case 2:
    gotMethod = true;
    org.acme.ws.next.HelloWorld2PortProxy.Descriptor returnp3mtemp = null;
    if (methodKey != null) {
        javax.xml.ws.Response resp = com.ibm.ccl.ws.jaxws.gstc.util.AsyncUtils.getResponse(session, methodKey);
        if (resp != null) {
            isDone = resp.isDone();
            if (!isDone)
                break;
            if (resp.get() != null) {
                Object o = resp.get();
                if (o instanceof javax.xml.transform.Source)
                    sourceOut = (javax.xml.transform.Source) o;
                else if (o instanceof org.acme.ws.next.HelloWorld2PortProxy.Descriptor)
                    returnp3mtemp = (org.acme.ws.next.HelloWorld2PortProxy.Descriptor) o;
            }
        }
    }
    else if (bypass) {
        javax.xml.ws.Dispatch dispatch = sampleHelloWorld2PortProxyid._getDescriptor().getDispatch();

        if (request.getParameter("__use_soapaction__") != null)
            com.ibm.ccl.ws.jaxws.gstc.util.DispatchUtils.useSoapAction(dispatch, request.getParameter("__soapaction__"));
        else
            com.ibm.ccl.ws.jaxws.gstc.util.DispatchUtils.clearSoapAction(dispatch);

        if (!async)
            sourceOut = (javax.xml.transform.Source) dispatch.invoke(sourceIn);
        else {
            // async code omitted
            break;
        }
    } else {
        if (!async) {
        try {
            returnp3mtemp = sampleHelloWorld2PortProxyid._getDescriptor();
            }catch(Exception exc){
                %>
                Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(exc.toString()) %>
                Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(exc.getMessage()) %>
                <%
break;
            }
        }
        else {
            // async code omitted
            break;
        }
    }
if (sourceOut != null) {
%>
    <TEXTAREA ROWS="8" COLs="45"><%= org.eclipse.jst.ws.util.JspUtils.markup(com.ibm.ccl.ws.jaxws.gstc.util.SourceUtils.transform(sourceOut)) %></TEXTAREA>
<%
}
else {
if (returnp3mtemp == null) {
%>
    null
<%
} else {
    %>
    <TABLE CLASS="tableform">
<TR>
<TD COLSPAN="2" VALIGN="TOP" ALIGN="LEFT" CLASS="headingcol">returnp:</TD>
<TR>
<TD CLASS="spacercol">&nbsp;</TD>
<TD COLSPAN="1" VALIGN="TOP" ALIGN="LEFT" CLASS="headingcol">proxy:</TD>
<TD>
<%
if(returnp3mtemp != null){
org.acme.ws.next.HelloWorld2 typeproxy5 = returnp3mtemp.getProxy();
if(typeproxy5 != null){
        if(typeproxy5!= null){
        String tempproxy5 = typeproxy5.toString();
        %>
        <%=tempproxy5%>
        <%
        }}
else{
        %>
        <%= typeproxy5%>
        <%
}
}
%>
</TD>
<TR>
<TD CLASS="spacercol">&nbsp;</TD>
<TD COLSPAN="1" VALIGN="TOP" ALIGN="LEFT" CLASS="headingcol">dispatch:</TD>
<TD>
<%
if(returnp3mtemp != null){
javax.xml.ws.Dispatch typedispatch7 = returnp3mtemp.getDispatch();
if(typedispatch7 != null){
        if(typedispatch7!= null){
        String tempdispatch7 = typedispatch7.toString();
        %>
        <%=tempdispatch7%>
        <%
        }}
else{
        %>
        <%= typedispatch7%>
        <%
}
}
%>
</TD>
<TR>
<TD CLASS="spacercol">&nbsp;</TD>
<TD COLSPAN="1" VALIGN="TOP" ALIGN="LEFT" CLASS="headingcol">endpoint:</TD>
<TD>
<%
if(returnp3mtemp != null){
java.lang.String typeendpoint9 = returnp3mtemp.getEndpoint();
if(typeendpoint9 != null){
        String tempResultendpoint9 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeendpoint9));
        %>
        <%= tempResultendpoint9 %>
        <%
}
else{
        %>
        <%= typeendpoint9%>
        <%
}
}
%>
</TD>
    </TABLE>
    <%
}
%>
<HR/><BR/>
<%
}
break;
case 13:
    gotMethod = true;
    java.lang.String returnp14mtemp = null;
    if (methodKey != null) {
        javax.xml.ws.Response resp = com.ibm.ccl.ws.jaxws.gstc.util.AsyncUtils.getResponse(session, methodKey);
        if (resp != null) {
            isDone = resp.isDone();
            if (!isDone)
                break;
            if (resp.get() != null) {
                Object o = resp.get();
                if (o instanceof javax.xml.transform.Source)
                    sourceOut = (javax.xml.transform.Source) o;
                else if (o instanceof java.lang.String)
                    returnp14mtemp = (java.lang.String) o;
            }
        }
    }
    else if (bypass) {
        javax.xml.ws.Dispatch dispatch = sampleHelloWorld2PortProxyid._getDescriptor().getDispatch();

        if (request.getParameter("__use_soapaction__") != null)
            com.ibm.ccl.ws.jaxws.gstc.util.DispatchUtils.useSoapAction(dispatch, request.getParameter("__soapaction__"));
        else
            com.ibm.ccl.ws.jaxws.gstc.util.DispatchUtils.clearSoapAction(dispatch);

        if (!async)
            sourceOut = (javax.xml.transform.Source) dispatch.invoke(sourceIn);
        else {
            // async code omitted
            break;
        }
    } else {
        String arg0_0id=  request.getParameter("arg016");
        String arg016null = request.getParameter("arg016null");
        java.lang.String arg0_0idTemp;
        if (arg016null != null)
            arg0_0idTemp = null;
        else {
         arg0_0idTemp  = arg0_0id;
        }

        if (!async) {
        try {
            returnp14mtemp = sampleHelloWorld2PortProxyid.helloName(arg0_0idTemp);
            }catch(Exception exc){
                %>
                Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(exc.toString()) %>
                Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(exc.getMessage()) %>
                <%
break;
            }
        }
        else {
            // async code omitted
            break;
        }
    }
if (sourceOut != null) {
%>
    <TEXTAREA ROWS="8" COLs="45"><%= org.eclipse.jst.ws.util.JspUtils.markup(com.ibm.ccl.ws.jaxws.gstc.util.SourceUtils.transform(sourceOut)) %></TEXTAREA>
<%
}
else {
if (returnp14mtemp == null) {
%>
    null
<%
} else {
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(returnp14mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
%>
<HR/><BR/>
<%
}
break;
}
} catch (Exception e) { 
%>
exception: <%=org.eclipse.jst.ws.util.JspUtils.markup(e.toString())%>
<%
return;
}
if(!gotMethod){
%>
Result: N/A
<%
} else if (!isDone) {
%>
No results available yet.
<%
} else if (async && methodKey == null) {
%>
The service has been invoked.
<script language="JavaScript">reloadMethods();</script>
<%
}
%>
</BODY>
</HTML>