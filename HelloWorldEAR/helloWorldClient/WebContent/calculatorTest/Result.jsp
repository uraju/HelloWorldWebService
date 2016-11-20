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
<jsp:useBean id="calculatorTestid" scope="session" class="org.acme.wsdl.CalculatorPortProxy" />

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
    int returnp3mtemp = 0;
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
                else if (o instanceof java.lang.Integer)
                    returnp3mtemp = ((java.lang.Integer) o).intValue();
            }
        }
    }
    else if (bypass) {
        javax.xml.ws.Dispatch dispatch = calculatorTestid._getDescriptor().getDispatch();

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
        String arg0_0id=  request.getParameter("arg05");
        int arg0_0idTemp  = Integer.parseInt(arg0_0id);

        String arg1_2id=  request.getParameter("arg17");
        int arg1_2idTemp  = Integer.parseInt(arg1_2id);

        if (!async) {
        try {
            returnp3mtemp = calculatorTestid.sum(arg0_0idTemp,arg1_2idTemp);
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
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(returnp3mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
%>
<HR/><BR/>
<%
}
break;
case 9:
    gotMethod = true;
    int returnp10mtemp = 0;
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
                else if (o instanceof java.lang.Integer)
                    returnp10mtemp = ((java.lang.Integer) o).intValue();
            }
        }
    }
    else if (bypass) {
        javax.xml.ws.Dispatch dispatch = calculatorTestid._getDescriptor().getDispatch();

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
        String arg0_4id=  request.getParameter("arg012");
        int arg0_4idTemp  = Integer.parseInt(arg0_4id);

        String arg1_6id=  request.getParameter("arg114");
        int arg1_6idTemp  = Integer.parseInt(arg1_6id);

        if (!async) {
        try {
            returnp10mtemp = calculatorTestid.multiply(arg0_4idTemp,arg1_6idTemp);
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
        String tempResultreturnp10 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(returnp10mtemp));
        %>
        <%= tempResultreturnp10 %>
        <%
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