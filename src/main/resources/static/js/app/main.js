var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert("글이 등록되었습니다.");
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }

};

main.init();

// 그냥 save 변수를 함수로 선언하고, init 변수에 함수를 또 선언하면 되는데
// 굳이 왜? main 변수의 속성으로 function을 추가했나?
// 만약, a.js가 main.hbs에 추가가 된다고 가정을 해보자.
// a.js에도 init function과 save function이 있다면 문제가 된다.
// 브라우저의 scope는 공용으로 쓰이기 때문에 나중에 불려진 js의 init, save가 먼저 불려진 js의 function을 덮어쓰게 되기 때문이다.
// 이런 문제를 피하기 위해 main.js만의 변수,function 영역으로 var main이란 객체 안에서 function을 선언합니다.