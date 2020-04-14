(this["webpackJsonphello-employee-admin"]=this["webpackJsonphello-employee-admin"]||[]).push([[0],{35:function(e,t,a){e.exports=a(63)},40:function(e,t,a){},63:function(e,t,a){"use strict";a.r(t);var n,l,r=a(0),c=a.n(r),m=a(17),u=a.n(m),i=(a(40),a(6)),o=a(14),s=a(1),d=a(3),E=a(5),f=a(4),p=Object(f.b)("OpenHome"),b=Object(f.b)("OpenInsult"),v=Object(f.b)("OpenModify"),y=Object(f.b)("OpenModify"),g=Object(f.b)("OpenRetire"),h=Object(f.b)("OpenEnroll"),O=Object(f.c)({insult:!1,modify:!1,retire:!1,enroll:!1,modal:!1},(n={},Object(d.a)(n,p,(function(e,t){return{insult:!1,modal:!1,modify:!1,retire:!1,enroll:!1}})),Object(d.a)(n,b,(function(e,t){return{insult:!0,modify:!1,modal:!1,retire:!1,enroll:!1}})),Object(d.a)(n,v,(function(e,t){return t.payload.modify?Object(E.a)({},e,{modify:!1}):Object(E.a)({},e,{modify:!0})})),Object(d.a)(n,g,(function(e,t){return{insult:!1,modify:!1,modal:!1,retire:!0,enroll:!1}})),Object(d.a)(n,h,(function(e,t){return{insult:!1,modify:!1,modal:!1,retire:!1,enroll:!0}})),Object(d.a)(n,y,(function(e,t){return t.payload.modal?Object(E.a)({},e,{modal:!1}):Object(E.a)({},e,{modal:!0})})),n)),N=Object(f.b)("SetHomeData"),S=Object(f.b)("SetModifyData"),D=Object(f.b)("SetInsultData"),j=Object(f.b)("SetRetireData"),I=Object(f.b)("SetSignInData"),C=Object(f.b)("SetSignUpData"),H=Object(f.b)("SetEnrollData"),A=Object(f.c)({Home:null,Todo:null,Sign:null,Insult:null,Modify:null,Retire:null,Enroll:null},(l={},Object(d.a)(l,I,(function(e,t){return Object(E.a)({},e,{Sign:{Up:null,In:t.payload.data}})})),Object(d.a)(l,C,(function(e,t){return Object(E.a)({},e,{Sign:{In:null,Up:t.payload.data}})})),Object(d.a)(l,N,(function(e,t){return Object(E.a)({},e,{Home:t.payload.res})})),Object(d.a)(l,D,(function(e,t){return Object(E.a)({},e,{Insult:t.payload.data})})),Object(d.a)(l,S,(function(e,t){return Object(E.a)({},e,{Modify:t.payload.data})})),Object(d.a)(l,j,(function(e,t){return Object(E.a)({},e,{Retire:t.payload.data})})),Object(d.a)(l,H,(function(e,t){return Object(E.a)({},e,{Enroll:t.payload.data})})),l));var M=function(e){return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"header-nav-wrapper"},c.a.createElement("header",null,c.a.createElement("div",{className:"header-container"},c.a.createElement(i.b,{to:"/Home"},c.a.createElement("h1",{className:"header-logo"},"Hello Employee")))),c.a.createElement("nav",null,c.a.createElement("div",{className:"nav-container"},c.a.createElement("ul",{className:"globalnav"},c.a.createElement("li",null,c.a.createElement(i.b,{to:"/Home",className:"current"},"\uc9c1\uc6d0")),c.a.createElement("li",null,c.a.createElement(i.b,{to:"/Todo"},"\uc77c\uc815")),c.a.createElement("li",null,c.a.createElement(i.b,{to:"/Home"},"\uadfc\ud0dc")),c.a.createElement("li",null,c.a.createElement(i.b,{to:"/Home"},"\ud734\uac00")),c.a.createElement("li",null,c.a.createElement(i.b,{to:"/Home"},"\uae09\uc5ec")))))))};var k=function(e){return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"column3"},c.a.createElement("div",{className:"map"},c.a.createElement("h2",null,"MAP"),c.a.createElement("div",{className:"map-image"},c.a.createElement("img",{src:"images/map.png",alt:"NEST 505 \uc9c0\ub3c4"})),c.a.createElement("p",{className:"map-txt"},"\uc11c\uc6b8\uc2dc \ub9c8\ud3ec\uad6c \ub9c8\ud3ec\ub300\ub85c14\uae38",c.a.createElement("br",null),"03-0000-0000",c.a.createElement("br",null),"\ub9c8\ud3ec\uc5ed\uc5d0\uc11c \uac78\uc5b4\uc11c 10\ubd84"))))};var x=function(e){var t=e.state,a=t.insult,n=t.retire,l=t.enroll,r=t.handleEnroll,m=t.handleHome,u=t.handleInsult,o=t.handleRetire;return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"column1"},c.a.createElement("h1",null,"\uc9c1\uc6d0\uad00\ub9ac"),c.a.createElement("ul",{className:"subnav"},c.a.createElement("li",null,c.a.createElement(i.b,{onClick:m,to:"/Home",className:a||n||l?"none":"current"},"\uc815\ubcf4 \uc218\uc815")),c.a.createElement("li",null,c.a.createElement(i.b,{onClick:u,to:"/Home",id:"Insult",className:a?"current":"none"},"\uc9c1\uc6d0 \ucd94\uac00")),c.a.createElement("li",null,c.a.createElement(i.b,{onClick:o,to:"/Home",id:"Retire",className:n?"current":"none"},"\ud1f4\uc9c1 \ucc98\ub9ac")),c.a.createElement("li",null,c.a.createElement(i.b,{onClick:r,to:"/Home",id:"Enroll",className:l?"current":"none"},"\uc9c0\ubb38 \ub4f1\ub85d")))))};var F=Object(s.b)((function(e){return{insult:e.Home.insult,retire:e.Home.retire,enroll:e.Home.enroll}}),(function(e){return{OpenHome:function(){return e(p())},OpenInsult:function(){return e(b())},OpenRetire:function(){return e(g())},OpenEnroll:function(){return e(h())}}}))((function(e){var t=e.insult,a=e.retire,n=e.enroll,l=e.OpenHome,r=e.OpenInsult,m=e.OpenRetire,u=e.OpenEnroll,i={insult:t,retire:a,enroll:n,handleEnroll:function(e){u()},handleInsult:function(e){r()},handleRetire:function(e){m()},handleHome:function(e){l()}};return c.a.createElement(c.a.Fragment,null,c.a.createElement(x,{state:i}))})),T={result:"success",data:[{emId:0,emPosition:"\ud504\ub860\ud2b8",emName:"\uae40\uc218\uc9c4",emTeam:"\uc9c1\uc6d0\uad00\ub9ac",emSecurityNum:"909090-2",emOpenTime:"00:00",emCloseTime:"22:00",emStartDate:"2020-01-01",emEndDate:"2120-02-20",emStatus:1,emPhone:"010-7799-9036",emFingerPrint:"wlans1"},{emId:1,emPosition:"\ubc31\uc5d4\ub4dc",emName:"\uc724\ubcf4\ubbfc",emTeam:"\uc9c1\uc6d0\uad00\ub9ac",emSecurityNum:"909090-1",emOpenTime:"10:00",emCloseTime:"22:00",emStartDate:"2020-01-01",emEndDate:"2120-01-01",emStatus:1,emPhone:"010-7799-9036",emFingerPrint:"wlans2"},{emId:2,emPosition:"\ud504\ub860\ud2b8",emName:"\uc774\uc7ac\ud601",emTeam:"\uc9c1\uc6d0\uad00\ub9ac",emSecurityNum:"909090-1",emOpenTime:"20:00",emCloseTime:"22:00",emStartDate:"2020-02-02",emEndDate:"2220-02-02",emStatus:1,emPhone:"010-7799-9036",emFingerPrint:null}]},P=JSON.stringify(T),R=a(12);var w=Object(s.b)((function(e){return{retire:e.Home.retire,enroll:e.Home.enroll}}),(function(e){return{SetHomeData:function(t){var a=t.res;return e(N({res:a}))},SetRetireData:function(t){var a=t.res;return e(j({res:a}))},SetEnrollData:function(t){var a=t.res;return e(H({res:a}))}}}))((function(e){var t=e.retire,a=e.enroll,n=e.SetEnrollData,l=e.SetRetireData,r=e.SetHomeData;return c.a.createElement(c.a.Fragment,null,c.a.createElement("span",null,"\uc774\ub984: "),c.a.createElement("input",{type:"text",className:"searchBox"}),c.a.createElement("button",{onClick:function(e){var c=document.querySelector(".searchBox");console.log("/employee/".concat(c.value)),R.get("/employee/".concat(c.value)).then((function(e){console.log(e),t?l({res:e.data.data}):a?n({res:e.data.data}):r({res:e.data.data})})),c.value=""}},"\uac80\uc0c9"))}));var L=function(e){var t=e.state.handleClick;return c.a.createElement("tr",null,c.a.createElement("td",null,e.item.emId),c.a.createElement("td",null,e.item.emName),c.a.createElement("td",null,e.item.emTeam),c.a.createElement("td",null,e.item.emPosition),c.a.createElement("td",null,e.item.emStatus),c.a.createElement("td",{value:e.item.emId,onClick:t},"\uc218\uc815"))};var J=Object(s.b)((function(e){return{modify:e.Home.modify}}),(function(e){return{OpenModify:function(t){var a=t.modify;return e(v({modify:a}))},SetModifyData:function(t){var a=t.data;return e(S({data:a}))}}}))((function(e){var t=e.item,a=e.modify,n=e.OpenModify,l=e.SetModifyData,r={handleClick:function(e){l({data:t}),n({modify:a})}};return c.a.createElement(L,{item:t,state:r})}));var V=Object(s.b)((function(e){return{data:e.Data.Home}}))((function(e){var t=e.data;return c.a.createElement(c.a.Fragment,null,c.a.createElement("table",null,c.a.createElement("thead",null,c.a.createElement("tr",null,c.a.createElement("th",null,"ID"),c.a.createElement("th",null,"\uc774\ub984"),c.a.createElement("th",null,"\ubd80\uc11c"),c.a.createElement("th",null,"\uc9c1\uae09"),c.a.createElement("th",null,"\uc7ac\uc9c1"),c.a.createElement("th",null,"\uc120\ud0dd"))),c.a.createElement("tbody",null,null===t||void 0===t?c.a.createElement("tr",null,c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading...")):t.map((function(e,t){return c.a.createElement(J,{key:t,item:e})})))))}));var U=function(e){var t=e.state,a=t.handleInsultData,n=t.InsultSubmit;return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"Modal"},c.a.createElement("main",{className:"modalMain"},c.a.createElement("div",{className:"modalContent"},c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\uc774\ub984:"),c.a.createElement("input",{id:"emName",className:"name data",type:"text",onChange:a})),c.a.createElement("div",{className:"content"},"\uc8fc\ubbfc\ubc88\ud638 :"," ",c.a.createElement("input",{id:"emSecurityNum",className:"id_front data",maxLength:"8",type:"text",onChange:a}),"* * * * * *"),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ud578\ub4dc\ud3f0 \ubc88\ud638:"),c.a.createElement("input",{id:"emPhone",className:"phone data",type:"text",onChange:a})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \ubd80\uc11c : "),c.a.createElement("input",{id:"emTeam",type:"text",className:"team data",onChange:a})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \uc9c1\ucc45 : ")," ",c.a.createElement("input",{id:"emPosition",className:"position data",type:"text",onChange:a})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \uacc4\uc57d\uc77c : "),c.a.createElement("input",{id:"emStartDate",onChange:a,type:"date",className:"startdate data",defaultValue:"2000-01-01"})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ub9cc\ub8cc\uc77c : "),c.a.createElement("input",{id:"emEndDate",onChange:a,type:"date",className:"enddate data",defaultValue:"2000-01-01"})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ucd9c\uadfc\uc2dc\uac04 : "),c.a.createElement("input",{id:"emOpenTime",className:"intime data",onChange:a,type:"text"})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ud1f4\uadfc\uc2dc\uac04 : "),c.a.createElement("input",{id:"emCloseTime",className:"outtime data",onChange:a,type:"text"})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\uc0c1\ud0dc : "),c.a.createElement("input",{id:"enStatus",className:"status data",onChange:a,type:"text"})),c.a.createElement("button",{className:"submit",onClick:function(e){return n(e)}},"\uc81c\ucd9c")))))},q=a(12),W=a.n(q);var X=Object(s.b)((function(e){return{InsultData:e.Data.Insult}}),(function(e){return{SetInsultData:function(t){var a=t.data;return e(D({data:a}))}}}))((function(e){var t=e.InsultData,a=e.SetInsultData,n={handleInsultData:function(e){var t={emId:0};document.querySelectorAll(".data").forEach((function(e){t=Object(E.a)({},t,Object(d.a)({},e.id,e.value))})),a({data:t})},InsultSubmit:function(e){console.log(JSON.stringify(t)),W.a.put("/employee",JSON.stringify(t)).then((function(e){return console.log(e)})).then((function(e){return alert("\uc9c1\uc6d0 \ucd94\uac00 \uc644\ub8cc!")}))}};return c.a.createElement(c.a.Fragment,null,c.a.createElement(U,{state:n}))}));var B=function(e){var t=e.state,a=t.ModifyData,n=t.handleModify,l=t.handleModifyData,r=t.submitModify;return c.a.createElement(c.a.Fragment,null,c.a.createElement("main",{className:"modalMain"},c.a.createElement("button",{className:"X",onClick:function(e){return n(e)}},"X"),c.a.createElement("div",{className:"modalContent"},c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\uc774\ub984:"),c.a.createElement("input",{onChange:l,className:"data",type:"text",id:"emName",defaultValue:a.emName})),c.a.createElement("div",{className:"content"},"\uc0dd\ub144\uc6d4\uc77c :",c.a.createElement("input",{type:"text",id:"emSecurityNum",defaultValue:a.emSecurityNum,className:"data"})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ud578\ub4dc\ud3f0 \ubc88\ud638:"),c.a.createElement("input",{onChange:l,className:"data",type:"tel",id:"emPhone",defaultValue:a.emPhone})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \ubd80\uc11c : "),c.a.createElement("input",{onChange:l,type:"text",className:"data",id:"emTeam",defaultValue:a.emTeam})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \uc9c1\ucc45 : "),c.a.createElement("input",{onChange:l,className:"data",type:"text",id:"emPosition",defaultValue:a.emPosition})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null," \uacc4\uc57d\uc77c : "),c.a.createElement("input",{onChange:l,type:"date",className:"data",id:"emStartDate",defaultValue:a.emStartDate})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ub9cc\ub8cc\uc77c : "),c.a.createElement("input",{onChange:l,type:"date",className:"data",id:"emEndDate",defaultValue:a.emEndDate})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ucd9c\uadfc\uc2dc\uac04 : "),c.a.createElement("input",{onChange:l,className:"data",type:"time",id:"emOpenTime",defaultValue:a.emOpenTime})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\ud1f4\uadfc\uc2dc\uac04 : "),c.a.createElement("input",{onChange:l,className:"outtime data",type:"time",id:"emCloseTime",defaultValue:a.emCloseTime})),c.a.createElement("div",{className:"content"},c.a.createElement("span",null,"\uc0c1\ud0dc : "),c.a.createElement("input",{onChange:l,className:"data",type:"text",id:"emStatus",defaultValue:a.emStatus})),c.a.createElement("button",{onClick:r,className:"submit"},"\uc81c\ucd9c"))))};var _=Object(s.b)((function(e){return{modify:e.Home.modify,ModifyData:e.Data.Modify}}),(function(e){return{OpenModify:function(t){var a=t.modify;return e(v({modify:a}))},SetModifyData:function(t){var a=t.data;return e(S({data:a}))}}}))((function(e){var t=e.ModifyData,a=e.modify,n=e.OpenModify,l=e.SetModifyData,r={ModifyData:t,handleModify:function(e){n({modify:a})},handleModifyData:function(e){var a=t;document.querySelectorAll(".data").forEach((function(e){a=Object(E.a)({},a,Object(d.a)({},e.id,e.value))})),l({data:a})},submitModify:function(e){console.log(JSON.stringify(t)),W.a.put("/employee",JSON.stringify(t)).then((function(e){return alert("\uc9c1\uc6d0\uc218\uc815 \uc644\ub8cc!",e)}))}};return c.a.createElement(B,{state:r})}));var z=function(e){return c.a.createElement("tr",null,c.a.createElement("td",null,c.a.createElement("span",null,e.item.emId)),c.a.createElement("td",null,c.a.createElement("span",null,e.item.emName)),c.a.createElement("td",null,c.a.createElement("span",null,e.item.emTeam)),c.a.createElement("td",null,c.a.createElement("span",null,e.item.emPosition)),c.a.createElement("td",null,c.a.createElement("span",null,e.item.emStatus)),c.a.createElement("td",null,c.a.createElement("input",{type:"checkbox",className:"check",value:e.item.emId})))};var G=function(e){var t=e.state,a=t.RetireData,n=t.RetireSubmit;return c.a.createElement(c.a.Fragment,null," ",c.a.createElement("div",{className:"news"},c.a.createElement("ul",{className:"news-contents"},c.a.createElement("li",null,c.a.createElement("table",null,c.a.createElement("thead",null,c.a.createElement("tr",null,c.a.createElement("th",null,"ID"),c.a.createElement("th",null,"\uc774\ub984"),c.a.createElement("th",null,"\ubd80\uc11c"),c.a.createElement("th",null,"\uc9c1\uae09"),c.a.createElement("th",null,"\uc7ac\uc9c1"),c.a.createElement("th",null,"\uc120\ud0dd"))),c.a.createElement("tbody",null,null===a?c.a.createElement("tr",null,c.a.createElement("td",null,"loading..."),c.a.createElement("td",null,"loading..."),c.a.createElement("td",null,"loading..."),c.a.createElement("td",null,"loading..."),c.a.createElement("td",null,"loading..."),c.a.createElement("td",null,"loading...")):a.map((function(e,t){return c.a.createElement(z,{key:t,item:e})})))),c.a.createElement("button",{onClick:n},"\ud1f4\uc9c1\ucc98\ub9ac")))))};var K=Object(s.b)((function(e){return{HomeData:e.Data.Home,RetireData:e.Data.Retire}}),(function(e){return{SetRetireData:function(t){var a=t.data;return e(j({data:a}))}}}))((function(e){var t=e.SetRetireData,a=e.RetireData,n=e.HomeData;Object(r.useEffect)((function(){return null===a&&t({data:n}),function(){return t({data:null})}}),[]);var l={RetireData:a,RetireSubmit:function(e){var t=document.querySelectorAll(".check"),l=[];t.forEach((function(e){e.checked&&l.push(n[e.value])})),console.log(JSON.stringify(a)),W.a.put("/employee",JSON.stringify(a)).then((function(e){return alert("\ud1f4\uc9c1\ucc98\ub9ac \uc644\ub8cc!",e)}))}};return c.a.createElement(G,{state:l})}));var Q=Object(s.b)((function(e){return{EnrollData:e.Data.Enroll,modal:e.Home.modal}}),(function(e){return{SetEnrollData:function(t){var a=t.data;return e(H({data:a}))},OpenModal:function(t){var a=t.modal;return e(y({modal:a}))}}}))((function(e){return e.modal,e.EnrollData,e.SetEnrollData,e.OpenModal,c.a.createElement("tr",null,c.a.createElement("td",null,e.item.emId),c.a.createElement("td",null,e.item.emName),c.a.createElement("td",null,e.item.emTeam),c.a.createElement("td",null,e.item.emPosition),c.a.createElement("td",null,null===e.item.emFingerPrint?"X":"O"),c.a.createElement("td",{value:e.item.emId,onClick:function(t){console.log(JSON.stringify(e.item)),W.a.put("/employee/finger",JSON.stringify(e.item)).then((function(e){console.log(e)}))}},null===e.item.emFingerPrint?"\ub4f1\ub85d":"\uc7ac\ub4f1\ub85d"))}));var Y=function(e){var t=e.state.EnrollData;return c.a.createElement(c.a.Fragment,null,c.a.createElement("table",null,c.a.createElement("thead",null,c.a.createElement("tr",null,c.a.createElement("th",null,"ID"),c.a.createElement("th",null,"\uc774\ub984"),c.a.createElement("th",null,"\ubd80\uc11c"),c.a.createElement("th",null,"\uc9c1\uae09"),c.a.createElement("th",null,"\uc9c0\ubb38\ubcf4\uc720"),c.a.createElement("th",null,"\ub4f1\ub85d/\uc7ac\ub4f1\ub85d"))),c.a.createElement("tbody",null,null===t?c.a.createElement("tr",null,c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading..."),c.a.createElement("td",null,"Loading...")):t.map((function(e,t){return c.a.createElement(Q,{key:t,item:e})})))))};var Z=Object(s.b)((function(e){return{HomeData:e.Data.Home,EnrollData:e.Data.Enroll,modal:e.Home.modal}}),(function(e){return{SetEnrollData:function(t){var a=t.data;return e(H({data:a}))},OpenModal:function(t){var a=t.modal;return e(y({modal:a}))}}}))((function(e){var t=e.SetEnrollData,a=e.EnrollData,n=e.modal,l=e.OpenModal;Object(r.useEffect)((function(){return null===a&&t({data:JSON.parse(P).data}),function(){return t({data:null})}}),[]);var m={EnrollData:a,HandleModal:function(e){l({modal:n})}};return c.a.createElement(Y,{state:m})}));var $=Object(s.b)((function(e){return{modify:e.Home.modify,insult:e.Home.insult,retire:e.Home.retire,enroll:e.Home.enroll}}),(function(e){return{}}))((function(e){return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"main-wrapper"},c.a.createElement("div",{className:"main-contents"},c.a.createElement("div",{className:"main-contents-container"},c.a.createElement(F,null),c.a.createElement("div",{className:"column2"},c.a.createElement("div",{className:"news"},c.a.createElement("ul",{className:"news-contents"},e.insult?c.a.createElement("li",null,c.a.createElement("h2",null,"\uc9c1\uc6d0 \ucd94\uac00"),c.a.createElement(X,null)):e.modify?c.a.createElement("li",null,c.a.createElement("h2",null,"\uc9c1\uc6d0 \uc815\ubcf4 \uc218\uc815"),c.a.createElement(_,null)):e.retire?c.a.createElement("li",null,c.a.createElement("h2",null,"\uc9c1\uc6d0 \ud1f4\uc9c1 \ucc98\ub9ac"),c.a.createElement(w,null),c.a.createElement(K,null)):e.enroll?c.a.createElement("li",null,c.a.createElement("h2",null,"\uc9c1\uc6d0 \uc9c0\ubb38 \ub4f1\ub85d"),c.a.createElement(w,null),c.a.createElement(Z,null)):c.a.createElement("li",null,c.a.createElement("h2",null,"\uc9c1\uc6d0 \uc815\ubcf4 \uc218\uc815"),c.a.createElement(w,null),c.a.createElement(V,null))))),c.a.createElement(k,null)))))}));var ee=function(e){return c.a.createElement("div",null,c.a.createElement("div",{className:"main-wrapper"},c.a.createElement("div",{className:"main-contents"},c.a.createElement("div",{className:"main-contents-container"},c.a.createElement("div",{className:"column2"},c.a.createElement("div",{className:"Warn"},"ERR! \uc798\ubabb\ub41c \uc811\uadfc\uc785\ub2c8\ub2e4!",c.a.createElement("span",null,c.a.createElement(i.b,{to:"/"},"\u2192 \uad00\ub9ac\uc790 \ub85c\uadf8\uc778\uc73c\ub85c \ub3cc\uc544\uac00\uae30"))))))))};var te,ae=function(e){return c.a.createElement(c.a.Fragment,null,c.a.createElement("footer",null,c.a.createElement("div",{className:"footer-container"},c.a.createElement("p",{className:"copyright"},"\xa9Hello Employee"))))},ne=Object(f.b)("SetisIn"),le=Object(f.b)("SetisAdmin"),re=Object(f.c)({isAdmin:!1,isIn:!0},(te={},Object(d.a)(te,ne,(function(e,t){return t.payload.isIn?Object(E.a)({},e,{isIn:!1}):Object(E.a)({},e,{isIn:!0})})),Object(d.a)(te,le,(function(e,t){return t.payload.isAdmin?Object(E.a)({},e,{isAdmin:!1}):Object(E.a)({},e,{isAdmin:!0})})),te));var ce=Object(s.b)((function(e){return{isAdmin:e.Sign.isAdmin}}),(function(e){return{SetisAdmin:function(t){var a=t.isAdmin;return e(le({isAdmin:a}))}}}))((function(e){var t=e.isAdmin,a=e.SetisAdmin;return c.a.createElement(c.a.Fragment,null,c.a.createElement("div",{className:"notice"},c.a.createElement("p",null,"\uad00\ub9ac\uc790 \ubaa8\ub4dc\uc5d0 \uc811\uadfc\ud558\uc168\uc2b5\ub2c8\ub2e4. \uad00\ub9ac\uc790 \uad8c\ud55c\uc774 \uc5c6\uc73c\uc2e4 \uacbd\uc6b0 \uc774\uc6a9\uc5d0 \uc81c\ud55c\uc774 \uc788\uc744 \uc218 \uc788\uc2b5\ub2c8\ub2e4.",c.a.createElement(i.b,{onClick:function(e){a({isAdmin:t})},to:"/"},c.a.createElement("span",{className:"notice-btn"},"\ub85c\uadf8\uc544\uc6c3")))))}));var me=function(e){return e.state.isAdmin?c.a.createElement(c.a.Fragment,null,c.a.createElement(M,null),c.a.createElement($,null),c.a.createElement(ae,null),c.a.createElement(ce,null)):c.a.createElement(c.a.Fragment,null,c.a.createElement(M,null),c.a.createElement(ee,null),c.a.createElement(ae,null))};var ue=Object(s.b)((function(e){return{insult:e.Home.insult,modify:e.Home.modify,selected:e.Home.selected,isAdmin:e.Sign.isAdmin}}),(function(e){return{OpenInsult:function(t){var a=t.insult;return e(b({insult:a}))},SetHomeData:function(t){var a=t.res;return e(N({res:a}))}}}))((function(e){var t=e.isAdmin,a=e.insult,n=e.modify,l=e.selected,m=e.OpenInsult,u=e.SetHomeData,i={isAdmin:t,modify:n,insult:a,selected:l,handleInsult:function(e){m({insult:a})}};return Object(r.useEffect)((function(){W.a.get("/employee").then((function(e){return console.log(e)})).then((function(e){return u({res:e.data.data})}))})),c.a.createElement(me,{state:i})}));var ie=function(e){return console.log(e.state),c.a.createElement("div",null,c.a.createElement("input",{type:"checkbox"}),c.a.createElement("span",null,e.state.emName))};var oe=function(e){return c.a.createElement(ie,{state:e.item})};var se=function(e){return c.a.createElement(c.a.Fragment,null,c.a.createElement("header",null,c.a.createElement("div",null,"\uc9c1\uc6d0\uc120\ud0dd"),c.a.createElement("div",null,c.a.createElement("input",{type:"checkbox"}),"\ud1f4\uc9c1\uc790\ubcf4\uae30",c.a.createElement("input",{type:"checkbox"}),"\uc804\uccb4\uc120\ud0dd")),c.a.createElement("nav",null,c.a.createElement("input",{type:"text"}),c.a.createElement("button",{type:"submit"},"\uac80\uc0c9")),c.a.createElement("main",{id:"employees"},e.state.map((function(e,t){return c.a.createElement(oe,{key:t,item:e})}))))};var de=Object(s.b)((function(e){return{state:e.Todo.data}}),(function(e){return{}}))((function(e){var t=e.state;return c.a.createElement(c.a.Fragment,null,c.a.createElement(se,{state:t}))}));var Ee=function(e){return e.state.isAdmin?c.a.createElement(c.a.Fragment,null,c.a.createElement(M,null),c.a.createElement(de,null),c.a.createElement(ae,null),c.a.createElement(ce,null)):c.a.createElement(c.a.Fragment,null,c.a.createElement(M,null),c.a.createElement(ee,null),c.a.createElement(ae,null))};var fe=Object(s.b)((function(e){return{isAdmin:e.Sign.isAdmin}}),(function(e){return{}}))((function(e){return c.a.createElement(Ee,{state:e})}));var pe=function(e){var t=e.state,a=t.handleClick,n=t.handleSignData;return c.a.createElement(c.a.Fragment,null,c.a.createElement("header",null,c.a.createElement("span",null,"\ud68c\uc6d0\uac00\uc785"),c.a.createElement("span",{onClick:a},"X")),c.a.createElement("main",null,c.a.createElement("div",null,c.a.createElement("span",null,"\ub9e4\uc7a5\uc774\ub984"),c.a.createElement("input",{type:"text",className:"data",onChange:n})),c.a.createElement("div",null,c.a.createElement("span",null,"ID"),c.a.createElement("input",{type:"text",className:"data",onChange:n}),c.a.createElement("button",null,"\uc911\ubcf5\ud655\uc778")),c.a.createElement("div",null,c.a.createElement("span",null,"PW"),c.a.createElement("input",{type:"password",className:"data",onChange:n})),c.a.createElement("div",null,c.a.createElement("span",null,"PW\ud655\uc778"),c.a.createElement("input",{type:"password",className:"data",onChange:n})),c.a.createElement("button",null,"\uac00\uc785\ud558\uae30")),c.a.createElement("footer",null))};var be=Object(s.b)((function(e){return{isIn:e.Sign.isIn,SignUpData:e.Sign.data}}),(function(e){return{SetisIn:function(t){var a=t.isIn;return e(ne({isIn:a}))},SetSignUpData:function(t){var a=t.data;return e(C({data:a}))}}}))((function(e){var t=e.isIn,a=e.SetisIn,n=e.SetSignUpData,l={handleClick:function(e){a({isIn:t})},handleSignData:function(e){for(var t=document.querySelectorAll(".data"),a=[],l=0;l<t.length;l++)a.push(t[l].value);n({data:a})}};return c.a.createElement(pe,{state:l})}));var ve=function(e){var t=e.state,a=t.handleSignData,n=t.SubmitSignIn;return c.a.createElement(c.a.Fragment,null,c.a.createElement("header",null,c.a.createElement("span",null,"\uad00\ub9ac\uc790 \ub85c\uadf8\uc778")),c.a.createElement("main",null,c.a.createElement("div",null,c.a.createElement("span",null,"PW"),c.a.createElement("input",{type:"password",className:"data",onChange:a})),c.a.createElement(i.b,{to:"/Home"},c.a.createElement("button",{onClick:n},"\ub85c\uadf8\uc778"))),c.a.createElement("footer",null))};var ye=Object(s.b)((function(e){return{isIn:e.Sign.isIn,isAdmin:e.Sign.isAdmin}}),(function(e){return{SetisIn:function(t){var a=t.isIn;return e(ne({isIn:a}))},SetisAdmin:function(t){var a=t.isAdmin;return e(le({isAdmin:a}))},SetSignInData:function(t){var a=t.data;return e(I({data:a}))}}}))((function(e){var t=e.isIn,a=e.isAdmin,n=e.SetisIn,l=e.SetSignInData,r=e.SetisAdmin,m={handleClick:function(e){n({isIn:t})},handleSignData:function(e){var t=document.querySelector(".data"),a=[];a.push(t.value),l({data:a})},SubmitSignIn:function(e){r({isAdmin:a})}};return c.a.createElement(ve,{state:m})}));var ge=function(e){var t=e.state.isIn;return c.a.createElement(c.a.Fragment,null,t?c.a.createElement(ye,null):c.a.createElement(be,null))};var he=Object(s.b)((function(e){return{isIn:e.Sign.isIn}}),(function(e){return{}}))((function(e){var t={isIn:e.isIn};return c.a.createElement(ge,{state:t})}));var Oe,Ne=function(){return c.a.createElement(i.a,null,c.a.createElement(o.a,{path:"/Home",exact:!0,component:ue}),c.a.createElement(o.a,{path:"/Todo",exact:!0,component:fe}),c.a.createElement(o.a,{path:"/",exact:!0,component:he}))},Se=a(9),De=Object(f.b)("SetisIn"),je=Object(f.b)("SetToDoData"),Ie=Object(f.c)({isIn:!0,data:[0,0,0]},(Oe={},Object(d.a)(Oe,De,(function(e,t){return t.payload.isIn?Object(E.a)({},e,{isIn:!1}):Object(E.a)({},e,{isIn:!0})})),Object(d.a)(Oe,je,(function(e,t){return Object(E.a)({},e,{data:{Up:null,In:t.payload.data}})})),Oe)),Ce=Object(Se.c)({Home:O,Sign:re,Todo:Ie,Data:A}),He=Object(f.a)({reducer:Ce});u.a.render(c.a.createElement(s.a,{store:He},c.a.createElement(Ne,null)),document.getElementById("root"))}},[[35,1,2]]]);
//# sourceMappingURL=main.8b0f9ce3.chunk.js.map