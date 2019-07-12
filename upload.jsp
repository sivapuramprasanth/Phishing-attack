<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<% String a="";%>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<script language="javascript" type='text/javascript'>
        function loadFileAsText()
    {
	
	    var fileToLoad = document.getElementById("file").files[0];
		var l=document.getElementById("file").value;
		document.getElementById("t42").value=document.getElementById("file").value.substring(l.lastIndexOf("\\")+1,l.lastIndexOf(""));
	    var fileReader = new FileReader();
	    fileReader.onload = function(fileLoadedEvent) 
    {
		var textFromFileLoaded = fileLoadedEvent.target.result;
		document.getElementById("textarea").value = textFromFileLoaded;
		
	};
	    fileReader.readAsText(fileToLoad, "UTF-8");
		
    }
	
</script>

</head>


        <p align="center">
        
        <form id="form1" name="form1" method="post" action="upload1.jsp">
          <table width="755"  border="1" align="center"  cellpadding="0" cellspacing="0">
             <tr>
              <td width="155" height="37"><div align="center" class="style3"><span class="style4 style1">Select File </span></div></td>
              <td width="437"><div align="center">
                <input required="required" type="file" name="t42" id="file"  onchange="loadFileAsText()" />
              </div></td>
             </tr>
             <tr>
              <td height="34" class="style4 style2 style3"><div align="center" class="style3">File Name </div></td>
              <td><div align="center">
                <input required="required" name="tt" type="text" id="t42" readonly="readonly" size="50"/>
              </div></td>
             </tr>
             <tr>
              <td height="258">&nbsp;</td>
              <td><div align="center">
                <textarea name="text" id="textarea" cols="50" rows="15"></textarea>
              </div></td>
             </tr>
            
             <tr>
              <td><div align="right"></div></td>
              <td><input type="submit" name="Submit" value="Upload" /></td>
             </tr>
          </table>
</form></p>
		
       
        
</html>
