$wnd.showcase.runAsyncCallback24("function GUb(a){this.a=a}\nfunction IUb(a){this.a=a}\nfunction KUb(a){this.a=a}\nfunction PUb(a,b){this.a=a;this.b=b}\nfunction Uo(a,b){a.remove(b)}\nfunction mmc(a){return Uac(),a.hb}\nfunction qmc(a,b){jmc(a,b);Uo((Uac(),a.hb),b)}\nfunction Lac(){var a;if(!Iac||Oac()){a=new jKc;Nac(a);Iac=a}return Iac}\nfunction Oac(){var a=$doc.cookie;if(a!=Jac){Jac=a;return true}else{return false}}\nfunction Pac(a){Kac&&(a=encodeURIComponent(a));$doc.cookie=a+'=;expires=Fri, 02-Jan-1970 00:00:00 GMT'}\nfunction DUb(a){var b,c,d,e;if(mmc(a.c).options.length<1){voc(a.a,'');voc(a.b,'');return}e=mmc(a.c).selectedIndex;b=nmc(a.c,e);c=(d=Lac(),sfb(b==null?fFc(BKc(d.d,null)):RKc(d.e,b)));voc(a.a,b);voc(a.b,c)}\nfunction CUb(a,b){var c,d,e,f,g,h;gh(a.c).options.length=0;h=0;e=new tGc(Lac());for(d=(g=e.a.Wh().fc(),new yGc(g));d.a.Og();){c=(f=ofb(d.a.Pg(),36),sfb(f.ai()));imc(a.c,c);ECc(c,b)&&(h=gh(a.c).options.length-1)}um((nm(),mm),new PUb(a,h))}\nfunction Nac(b){var c=$doc.cookie;if(c&&c!=''){var d=c.split('; ');for(var e=d.length-1;e>=0;--e){var f,g;var h=d[e].indexOf('=');if(h==-1){f=d[e];g=''}else{f=d[e].substring(0,h);g=d[e].substring(h+1)}if(Kac){try{f=decodeURIComponent(f)}catch(a){}try{g=decodeURIComponent(g)}catch(a){}}b.Yh(f,g)}}}\nfunction BUb(a){var b,c,d;c=new rkc(3,3);a.c=new smc;b=new Zdc('Delete');Fh((Uac(),b.hb),uUc,true);Kjc(c,0,0,'<b><b>Existing Cookies:<\\/b><\\/b>');Njc(c,0,1,a.c);Njc(c,0,2,b);a.a=new Eoc;Kjc(c,1,0,'<b><b>Name:<\\/b><\\/b>');Njc(c,1,1,a.a);a.b=new Eoc;d=new Zdc('Set Cookie');Fh(d.hb,uUc,true);Kjc(c,2,0,'<b><b>Value:<\\/b><\\/b>');Njc(c,2,1,a.b);Njc(c,2,2,d);Mh(d,new GUb(a),(It(),It(),Ht));Mh(a.c,new IUb(a),(Bt(),Bt(),At));Mh(b,new KUb(a),(null,Ht));CUb(a,null);return c}\nICb(485,1,UQc,GUb);_.Sc=function HUb(a){var b,c,d;c=roc(this.a.a);d=roc(this.a.b);b=new eeb(eCb(kCb((new ceb).q.getTime()),xVc));if((BCc(),c).length<1){$wnd.alert('You must specify a cookie name');return}Qac(c,d,b);CUb(this.a,c)};var Qrb=JBc(hRc,'CwCookies/1',485);ICb(486,1,VQc,IUb);_.Rc=function JUb(a){DUb(this.a)};var Rrb=JBc(hRc,'CwCookies/2',486);ICb(487,1,UQc,KUb);_.Sc=function LUb(a){var b,c;c=gh(this.a.c).selectedIndex;if(c>-1&&c<gh(this.a.c).options.length){b=nmc(this.a.c,c);Pac(b);qmc(this.a.c,c);DUb(this.a)}};var Srb=JBc(hRc,'CwCookies/3',487);ICb(488,1,bRc);_.Bc=function OUb(){XEb(this.b,BUb(this.a))};ICb(489,1,{},PUb);_.Dc=function QUb(){this.b<gh(this.a.c).options.length&&rmc(this.a.c,this.b);DUb(this.a)};_.b=0;var Urb=JBc(hRc,'CwCookies/5',489);var Iac=null,Jac;zNc(Bl)(24);\n//# sourceURL=showcase-24.js\n")