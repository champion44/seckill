//存放交互逻辑的js代码
//javascript模块化 就是分包
var  seckill = {

    //封装秒杀相关ajax 的url
    URL:{

    },
    //验证手机号

    validatePhone:function (phone) {
        if(phone && phone.length == 11 && !isNaN(phone)){
            return true;
        }else {
            return false;
        }
    },
    //详情页秒杀逻辑
    detail:{
        init:function(params){
            //用户手机验证和登陆，计时交互
            //规划交互流程
            //在cookie中查找手机号
            var killPhone = $.cookie('killPhone');
            var startTime = params['startTime'];
            var endTime = params['endTime'];
            var seckillId = params['seckillId'];

            if(!seckill.validatePhone(killPhone)){
            //    绑定手机号
                var killPhoneModal = $('#killPhoneModal');
                killPhoneModal.modal({
                    show:true,//显示弹出层
                    backdrop:'static',//禁止位置关闭
                    keyboard:false//关闭键盘时间
                    
                });
                $('#killPhoneBtn').click(function () {
                   var inputPhone = $('#killPhoneKey').val();
                   if(seckill.validatePhone(inputPhone)){
                       $.cookie('killPhone',inputPhone,{expires:7,path:'/seckill'});
                       window.location.reload();
                   }else{
                        $('#killPhoneMessage').hide().html('<label class="label-danger">手机号错误</label>').show(300);
                   }
                });
            }
        }
    }
}