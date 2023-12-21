<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyWeb Chatting</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>


<style type="text/css">
 *{
  font-family: 나눔고딕;
 }
 #messageWindow{
  background: black; 
  color: greenyellow;
 }
 #inputMessage{
  width:500px;
  height:20px
 }
 #btn-submit{
  background: white;
  background: #F7E600;
  width:60px;
  height:30px;
  color:#607080;
  border:none;
 }
 
 #main-container{
  width:600px;
  height:680px;
  border:1px solid black;
  margin:10px;
  display: inline-block;
  
 }
 #chat-container{
  vertical-align: bottom;
  border: 1px solid black;
  margin:10px;
  min-height: 600px;
  max-height: 600px;
  overflow: scroll;
  overflow-x:hidden;
  background: #9bbbd4;
 }
 
 .chat{
  font-size: 20px;
  color:black;
  margin: 5px;
  min-height: 20px;
  padding: 5px;
  min-width: 50px;
  text-align: left;
        height:auto;
        word-break : break-all;
        background: #ffffff;
        width:auto;
        display:inline-block;
        border-radius: 10px 10px 10px 10px;
 }
 
 .notice{
  color:#607080;
  font-weight: bold;
  border : none;
  text-align: center;
  background-color: #9bbbd4;
  display: block;
 }

 .my-chat{
  text-align: right;
  background: #F7E600;
  border-radius: 10px 10px 10px 10px;
 }
 
 #bottom-container{
  margin:10px;
 }
 
 .chat-info{
  color:#556677;
  font-size: 10px;
  text-align: right;
  padding: 5px;
  padding-top: 0px;

 }
 
 .chat-box{
  text-align:left;
 }
 .my-chat-box{
  text-align: right;
 }
 
 
 
</style>
</head>
<body>
<!--  <div id="main-container">
  <div id="chat-container">
   
  </div>
  <div id="bottom-container">
   <input id="inputMessage" type="text">
   <input id="btn-submit" type="submit" value="전송" >
  </div>
 </div>
</body> -->
<!-- https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js -->



<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js"></script> -->
<script src="resources/js/sockjs-0.3.4.js"></script>
<script src="resources/js/stomp.js"></script>
<script src="resources/js/webSocketSendToUserApp.js"></script>

        <script type="text/javascript">
            var stompClient = null;
            
            function setConnected(connected) {
                document.getElementById('connect').disabled = connected;
                document.getElementById('disconnect').disabled = !connected;
                document.getElementById('conversationDiv').style.visibility 
                  = connected ? 'visible' : 'hidden';
                document.getElementById('response').innerHTML = '';
            }
            
            function connect() {
                var socket = new SockJS('${pageContext.request.contextPath}/chat');
                stompClient = Stomp.over(socket);  
                stompClient.connect({}, function(frame) {
                    setConnected(true);
                    console.log('Connected: ' + frame);
                    stompClient.subscribe('/topic/messages', function(messageOutput) {
                        showMessageOutput(JSON.parse(messageOutput.body));
                    });
                });
            }
            
            function disconnect() {
                if(stompClient != null) {
                    stompClient.disconnect();
                }
                setConnected(false);
                console.log("Disconnected");
            }
            
            function sendMessage() {
                var from = document.getElementById('from').value;
                var text = document.getElementById('text').value;
                stompClient.send("/app/chat", {}, 
                  JSON.stringify({'from':from, 'text':text}));
            }
            
            function showMessageOutput(messageOutput) {
                var response = document.getElementById('response');
                var p = document.createElement('p');
                p.style.wordWrap = 'break-word';
                p.appendChild(document.createTextNode(messageOutput.from + ": " 
                  + messageOutput.text + " (" + messageOutput.time + ")"));
                response.appendChild(p);
            }
        </script>
    </head>
    <body onload="disconnect()">
        <div>
            <div>
                <input type="text" id="from" placeholder="Choose a nickname"/>
            </div>
            <br />
            <div>
                <button id="connect" onclick="connect();">Connect</button>
                <button id="disconnect" disabled="disabled" onclick="disconnect();">
                    Disconnect
                </button>
            </div>
            <br />
            <div id="conversationDiv">
                <input type="text" id="text" placeholder="Write a message..."/>
                <button id="sendMessage" onclick="sendMessage();">Send</button>
                <p id="response"></p>
            </div>
        </div>
${pageContext.request.contextPath}
    </body>
</html>