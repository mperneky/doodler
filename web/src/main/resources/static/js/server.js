var express = require('express');
var app = express();
app.use(express.static('public'));
var server = app.listen(3000, listen);

function listen() {
    var host = server.address().address;
    var port = server.address().port;
    console.log('Example app listening at http://' + '192.168.0.105' + ':' + port);
}

var io = require('socket.io')(server);

io.sockets.on('connection', onConnection);

function onConnection(socket) {
    console.log("We have a new client: " + socket.id);
    socket.on('mouse', broadcastData);

    function broadcastData(data) {
        socket.broadcast.emit('mouse', data);
    }

    socket.on('disconnect', disconnect);
}

function disconnect() {
    console.log("Client has disconnected");
}

