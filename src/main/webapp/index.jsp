<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script type="text/javascript" src="jquery-3.6.0.js"></script>
    <script type="text/javascript">
        function setConstractHash(){
            var addr = $(".setContractAddr").val();
            $(".QRHash").val(addr);
        }
    </script>
</head>
<body>
<a href="hello-servlet">hello servlet</a>
<br/>
<a href="test">test</a>
<div>v1.4</div><hr/>
<div>deployNewContract</div>
<%--    <form class="constractHash" action="/QRdemo-1.0-SNAPSHOT/deployNewContract" method="get">--%>
<%--        <input type="submit">--%>
<%--    </form><hr/>--%>
        <a href="deployNewContract">deployNewContract</a>
<%--    设置后续通用合约地址--%>

<input class="setContractAddr" type="text" name="solAddr" value="000">
    <button onclick="setConstractHash()">设置合约地址</button><hr/>
<%--添加管理员--%>
<div>addAdministrator</div>
    <form class="addAdministrator" action="/QRdemo-1.0-SNAPSHOT/addAdministratorServlet" method="get">
        <input class="QRHash" type="hidden" name="QRHash">
        <input type="submit"><br/>
    </form><hr/>
<%--创建新币--%>
<div>createNewCoin</div>
    <form class="createNewCoin" action="/QRdemo-1.0-SNAPSHOT/createNewCoinServlet" method="get">
        <input class="QRHash" type="hidden" name="QRHash">
        initQRData<input type="text" name="initQRData"><br/>
        <input type="submit">
    </form><hr/>
<%--查询并更新币--%>
<div>getQRCoinInform</div>
    <form class="getQRCoinInform" action="/QRdemo-1.0-SNAPSHOT/getQRCoinInformServlet" method="get">
        <input class="QRHash" type="hidden" name="QRHash">
        getQRcoinHash<input type="text" name="getQRcoinHash"><br/>
        getQRcoinNote<input type="text" name="getQRcoinNote"><br/>
        <input type="submit">
    </form><hr/>
<%--注销币--%>
<div>logoutQRCoin</div>
    <form class="logoutQRCoin" action="/QRdemo-1.0-SNAPSHOT/logoutQRCoinServlet" method="get">
        <input class="QRHash" type="hidden" name="QRHash">
        logoutQRHash<input type="text" name="logoutQRHash"><br/>
        <input type="submit">
    </form><hr/>
</body>
</html>