var socket;

function setup() {
    createCanvas(400, 400);
    background(0);
    socket = io.connect('http://192.168.0.105:3000');
    socket.on('mouse', draw);
}

function draw(data) {
    console.log("Got: " + data.x + " " + data.y);
    fill(0, 0, 255);
    noStroke();
    ellipse(data.x, data.y, 20, 20);
}

function mouseDragged() {
    fill(255);
    noStroke();
    ellipse(mouseX, mouseY, 20, 20);
    sendmouse(mouseX, mouseY);
}

function sendmouse(xpos, ypos) {
    var data = {
        x: xpos,
        y: ypos
    };
    socket.emit('mouse', data);
}