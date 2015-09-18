<html>
    <head>
        <script src="ajax.js"></script>
    </head>
    <body>
        <p>Result from invocation:</p>
        <script>
			var client = new AjaxService('http://localhost:8080/redstone-rpc/xml-rpc', 'RandomNumberGenerator');
            var result = client.invoke( 'nextInt', [ 10 ] );
            document.write( '<p>' + result + '<p>' );
        </script>
    </body>
</html>