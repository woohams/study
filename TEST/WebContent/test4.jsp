<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!doctype html>
<html>
<head>
<title>::성적 계산::</title>
<link rel="icon" type="image/png" sizes="16x16" href="calcFavicon.png">
<link rel="stylesheet" type="text/css" href="test.css">
<script type="text/javascript">
	
<%
	//1. 사용자가 입력한 값 받기(num, java, db, jsp)
	//내장객체 : request. HttpServletRequest 타입 : response. HttpServletResponse 타입
	String num = request.getParameter("num");
	String jav = request.getParameter("java");
	String db = request.getParameter("db");
	String jsp = request.getParameter("jsp");
	out.println("학번 : " + num + ", java=" + jav + ", db=" + db + ", jsp=" + jsp);

	// 유효성 체크 널 체크 => 요청 경로가 잘못된 경우
	if (num == null || jav == null || db == null || jsp == null) {
%>
	//자바스크립트 처리방식
	<script type="text/javascript">
	alert('잘못 들어온 경로입니다');
	location.href = 'test3.html';
</script>

<%
	return;
	}

	//3. 빈문자열로 넘어올 경우 0점 처리 
	if (jav.trim().isEmpty()) {
		jav = "0";
	}
	if (db.trim().isEmpty()) {
		db = "0";
	}
	if (jsp.trim().isEmpty()) {
		jsp = "0";
	}

	int javInt = Integer.parseInt(jav.trim());
	int dbInt = Integer.parseInt(db.trim());
	int jspInt = Integer.parseInt(jsp.trim());

	int sum = javInt + dbInt + jspInt;
	float avg = sum / 3.0f;
	
	String score = " ";
	String grade = " ";
	if(avg >= 95) {
		score = "A+";
	} else if(avg >= 90 && avg < 95) {
		score = "A";
	} else if(avg >= 85 && avg < 90) {
		score = "B+";
	} else if(avg >= 80 && avg < 85) {
		score = "B";
	} else if(avg >= 75 && avg < 80) {
		score = "C+";
	} else if(avg >= 70 && avg < 75) {
		score = "C";
	} else if(avg >= 65 && avg < 70) {
		score = "D+";
	} else if(avg >= 60 && avg < 65) {
		score = "D";
	} else {
		score = "F";
	}
	
	if(score == "A" || score == "A+"){
		grade = "훌륭합니다!";
	} else if(score == "B" || score == "B+"){
		grade = "잘했습니다!!";
	} else if(score == "C" || score == "C+"){
		grade = "조금 더 노력하십시오.";
	} else if(score == "D" || score =="D+"){
		grade = "많이 노셨네요?";
	} else if(score == "F"){
		grade = "나가 뒤지십시오.";
	}
	
%>

<br> sum:
<%=sum%>
<br> avg:
<%=avg%>
<br> score:
<%=score %>
</script>
<style type="text/css">

th, td {
  text-align: left;
  padding: 8px;
}

/*tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}*/
</style>
<h1>&nbsp;&nbsp;&nbsp;당신의 성적표</h1>
<table border='1'>
	<tr>
		<td colspan="2">학번</td>
		<td><b><%=num%></b></td>
	</tr>
	<tr>
		<td rowspan="3">과목</td>
		<td>Java</td>
		<td><b><%=javInt%></b></td>
	</tr>
	<tr>
		<td>Database</td>
		<td><b><%=dbInt%></b></td>
	</tr>
	<tr>
		<td>JSP</td>
		<td><b><%=jspInt%></b></td>
	</tr>
	<tr>
		<td colspan="2">평균점수</td>
		<td style="color: red"><b><%=avg%></b></td>
	</tr>
	<tr>
		<td colspan="2">학 점</td>
		<td style="color: blue"><b><%=score %></b></td>
	<tr>
	<tr>
		<td colspan="2">코멘트</td>
		<td style="color: orange"><b><%=grade %></b></td>
	<tr>
		<td colspan="3" style="text-align: right;">
			<input type="button" class="button4" type="button" onclick="history.back()" value="입력화면" />
		</td>
	</tr>
</table>
</html>