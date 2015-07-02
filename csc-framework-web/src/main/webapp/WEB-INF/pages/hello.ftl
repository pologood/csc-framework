<#import "spring.ftl" as spring />
<html>
<head>
<#--本地资源获取，需要在webapp下面建立resources文件夹-->
    <script src="<@spring.url '/resources/js/1.js'/>"></script>
</head>
<body>


<h1>${greeting}</h1>
</body>
</html>