<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dubbo-web</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/library/jquery.min.js"></script>
</head>
<body>
<h2>hello dubbo web</h2>

<form id="form">
    <label>
        <input type="text" name="name"/>
    </label>
</form>
<button id="btn">发送请求</button>
<script>
    $(function () {
        $('#btn').click(function () {
            let name = $('#form [name="name"]').val();
            $.ajax({
                type: 'post',
                url: '${pageContext.request.contextPath}/getHello',
                data: name,
                contentType: 'application/json',
                success: function (data) {
                    alert('成功:\n' + data);
                },
                error: function (data) {
                    alert('失败...');
                }
            });
        });
    });
</script>

</body>
</html>
