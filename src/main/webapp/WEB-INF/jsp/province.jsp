<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>省市区三级联动</title>
    <link href="<%=basePath %>/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <form name="infoform" action="<%=request.getContextPath()%>/output/province" method="post">
        <select name="province" id="province" onchange="openCityList(),openCountyList(),openTownList()">
            <option value="province" selected="selected">选择省</option>
        </select>
        <select name="city" id="city" onchange="openCountyList(),openTownList()">
            <option value="city" selected="selected">选择市</option>
        </select>
        <select name="area" id="area" onchange="openTownList()">
            <option value="area" selected="selected">选择区</option>
        </select>
        <button id="btn_sub" type="submit">提交</button>
    </form>

    <script src="<%=basePath %>/js/jquery.min.js"></script>
    <script src="<%=basePath %>/js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $.ajax({
                type:"GET",
                url:"<%=request.getContextPath()%>/prac/provincelist",
                dataType:"json",
                success: function (data) {
                    var str = "<option value='province' selected='selected'>选择省</option>";
                    for(var i=0; i<data.length; i++){
                        str += "<option value=" + data[i].provinceCode + ">" + data[i].provinceName + "</option>";
                    }
                    $("#province").html(str);
                }

            });
        });
        $("#btn_sub").on('click', function () {
            var pro = $("#province").val();
            var city = $("#city").val();
            var area = $("#area").val();
            if(pro == "province"){
                alert("请选择省");
                return false;
            }
            if(pro == "city"){
                alert("请选择市");
                return false;
            }
            if(pro == "area"){
                alert("请选择区");
                return false;
            }

            return true;
        });

        $(document).ready(function () {
            $('#province').change(function(){
                var provincecode = $('#province').val();
                getCityByProvincecode(provincecode);
            });

            $('#city').change(function(){
                var citycode = $('#city').val();
                getAreaByCitycode(citycode);
            });

        });

        function getCityByProvincecode(provincecode) {
            if(provincecode  == null)
                return;
            $.ajax({
                type:"GET",
                url:"<%=request.getContextPath()%>/prac/citylist",
                data:{"provincecode":provincecode},
                success:function (data) {
                    var str = "";
                    for (var i=0; i<data.length; i++){
                        str += "<option value=" + data[i].cityCode + ">" + data[i].cityName + "</option>";
                    }
                    $('#city').html(str);
                }
            });
        }

        function getAreaByCitycode(citycode) {
            if(citycode  == null)
                return;
            $.ajax({
                type:"GET",
                url:"<%=request.getContextPath()%>/prac/arealist",
                data:{"citycode":citycode},
                success:function (data) {
                    var str = "";
                    for (var i=0; i<data.length; i++){
                        str += "<option value=" + data[i].areaCode + ">" + data[i].areaName + "</option>";
                    }
                    $('#area').html(str);
                }
            });
        }
    </script>
</body>
</html>
