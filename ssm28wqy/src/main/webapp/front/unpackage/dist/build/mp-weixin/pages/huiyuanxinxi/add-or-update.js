(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/huiyuanxinxi/add-or-update"],{"019e":function(n,e,a){"use strict";(function(n){a("bbc1");t(a("66fd"));var e=t(a("08e7"));function t(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,a("543d")["createPage"])},"08e7":function(n,e,a){"use strict";a.r(e);var t=a("98ec"),i=a("3d5e");for(var r in i)"default"!==r&&function(n){a.d(e,n,(function(){return i[n]}))}(r);a("3d15");var u,o=a("f0c5"),c=Object(o["a"])(i["default"],t["b"],t["c"],!1,null,"8bc6e50c",null,!1,t["a"],u);e["default"]=c.exports},"14f9":function(n,e,a){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var t=i(a("a34a"));function i(n){return n&&n.__esModule?n:{default:n}}function r(n,e,a,t,i,r,u){try{var o=n[r](u),c=o.value}catch(s){return void a(s)}o.done?e(c):Promise.resolve(c).then(t,i)}function u(n){return function(){var e=this,a=arguments;return new Promise((function(t,i){var u=n.apply(e,a);function o(n){r(u,t,i,o,c,"next",n)}function c(n){r(u,t,i,o,c,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([a.e("common/vendor"),a.e("components/w-picker/w-picker")]).then(function(){return resolve(a("04d2"))}.bind(null,a)).catch(a.oe)},c={data:function(){return{ruleForm:{zhanghao:"",xingming:"",huiyuankahao:this.getUUID(),huiyuanleixing:"",huiyuandengji:"",banlishijian:"",daoqishijian:"",beizhu:"",tupian:"",userid:""},zhanghaoOptions:[],zhanghaoIndex:0,user:{},ro:{zhanghao:!1,xingming:!1,huiyuankahao:!1,huiyuanleixing:!1,huiyuandengji:!1,banlishijian:!1,daoqishijian:!1,beizhu:!1,tupian:!1,userid:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var a=this;return u(t.default.mark((function i(){var r,u,o,c;return t.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return r=n.getStorageSync("nowTable"),i.next=3,a.$api.session(r);case 3:return u=i.sent,a.user=u.data,i.next=7,a.$api.option("yonghu","zhanghao",{});case 7:if(u=i.sent,a.zhanghaoOptions=u.data,a.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(a.ruleForm.refid=e.refid,a.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){i.next=17;break}return a.ruleForm.id=e.id,i.next=15,a.$api.info("huiyuanxinxi",a.ruleForm.id);case 15:u=i.sent,a.ruleForm=u.data;case 17:if(!e.cross){i.next=64;break}o=n.getStorageSync("crossObj"),i.t0=t.default.keys(o);case 20:if((i.t1=i.t0()).done){i.next=64;break}if(c=i.t1.value,"zhanghao"!=c){i.next=26;break}return a.ruleForm.zhanghao=o[c],a.ro.zhanghao=!0,i.abrupt("continue",20);case 26:if("xingming"!=c){i.next=30;break}return a.ruleForm.xingming=o[c],a.ro.xingming=!0,i.abrupt("continue",20);case 30:if("huiyuankahao"!=c){i.next=34;break}return a.ruleForm.huiyuankahao=o[c],a.ro.huiyuankahao=!0,i.abrupt("continue",20);case 34:if("huiyuanleixing"!=c){i.next=38;break}return a.ruleForm.huiyuanleixing=o[c],a.ro.huiyuanleixing=!0,i.abrupt("continue",20);case 38:if("huiyuandengji"!=c){i.next=42;break}return a.ruleForm.huiyuandengji=o[c],a.ro.huiyuandengji=!0,i.abrupt("continue",20);case 42:if("banlishijian"!=c){i.next=46;break}return a.ruleForm.banlishijian=o[c],a.ro.banlishijian=!0,i.abrupt("continue",20);case 46:if("daoqishijian"!=c){i.next=50;break}return a.ruleForm.daoqishijian=o[c],a.ro.daoqishijian=!0,i.abrupt("continue",20);case 50:if("beizhu"!=c){i.next=54;break}return a.ruleForm.beizhu=o[c],a.ro.beizhu=!0,i.abrupt("continue",20);case 54:if("tupian"!=c){i.next=58;break}return a.ruleForm.tupian=o[c],a.ro.tupian=!0,i.abrupt("continue",20);case 58:if("userid"!=c){i.next=62;break}return a.ruleForm.userid=o[c],a.ro.userid=!0,i.abrupt("continue",20);case 62:i.next=20;break;case 64:a.styleChange();case 65:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},zhanghaoChange:function(n){var e=this;return u(t.default.mark((function a(){var i;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return e.zhanghaoIndex=n.target.value,e.ruleForm.zhanghao=e.zhanghaoOptions[e.zhanghaoIndex],a.next=4,e.$api.follow("yonghu","zhanghao",{columnValue:e.ruleForm.zhanghao});case 4:i=a.sent,i.data.xingming&&(e.ruleForm.xingming=i.data.xingming);case 6:case"end":return a.stop()}}),a)})))()},banlishijianChange:function(n){this.ruleForm.banlishijian=n.target.value,this.$forceUpdate()},daoqishijianChange:function(n){this.ruleForm.daoqishijian=n.target.value,this.$forceUpdate()},tupianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.tupian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function e(){return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!n.ruleForm.huiyuandengji||n.$validate.isIntNumer(n.ruleForm.huiyuandengji)){e.next=3;break}return n.$utils.msg("会员等级应输入整数"),e.abrupt("return");case 3:if(!n.ruleForm.id){e.next=8;break}return e.next=6,n.$api.update("huiyuanxinxi",n.ruleForm);case 6:e.next=10;break;case 8:return e.next=10,n.$api.add("huiyuanxinxi",n.ruleForm);case 10:n.$utils.msgBack("提交成功");case 11:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,a=e.getFullYear(),t=e.getMonth()+1,i=e.getDate();return"start"===n?a-=60:"end"===n&&(a+=2),t=t>9?t:"0"+t,i=i>9?i:"0"+i,"".concat(a,"-").concat(t,"-").concat(i)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,a("543d")["default"])},"3d15":function(n,e,a){"use strict";var t=a("fd82"),i=a.n(t);i.a},"3d5e":function(n,e,a){"use strict";a.r(e);var t=a("14f9"),i=a.n(t);for(var r in t)"default"!==r&&function(n){a.d(e,n,(function(){return t[n]}))}(r);e["default"]=i.a},"98ec":function(n,e,a){"use strict";var t;a.d(e,"b",(function(){return i})),a.d(e,"c",(function(){return r})),a.d(e,"a",(function(){return t}));var i=function(){var n=this,e=n.$createElement;n._self._c},r=[]},fd82:function(n,e,a){}},[["019e","common/runtime","common/vendor"]]]);