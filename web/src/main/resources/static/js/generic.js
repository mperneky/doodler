function initializePage(address) {
    socket = io.connect('http://' + address + ':3000');

    createCanvas(1280, 1024);
    background(0);
    socket.on('mouse', draw);
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

function draw(data) {
    fill(0, 0, 255);
    noStroke();
    ellipse(data.x, data.y, 20, 20);
}