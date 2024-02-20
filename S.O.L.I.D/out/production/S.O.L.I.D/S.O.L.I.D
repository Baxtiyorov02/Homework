
S.O.L.I.T
// Singly responsibility
bu tamoilda har bir clasning o`z vazifasi bo`lishi kk.
Ya`ni Har bir classda O`ziga tegishli maydonlar va metodlar ustida amal bajarishi kk.
 Misol uchun DB mi faqat ma`lumotlarni saqlasin
 Personmi personning ismi id si xususiyatlarini ustida al\mal bajarsin
 Registrasiyami faqat registrarsiya qilsin
 Oshpazmi ovqat pishirsin ovqatni tashib berishi shartmas

// Open-Closed
Bu tamolda biz yozgan kodlar qo`shimcha qo`shishga ochiq, o`zgartirishga yopiq bo`lishi kk
ya`ni kodni shunday yozishimiz kk ki dasturga qo`shimcha qoshganimizda uning oldin yozilgan
me`todlarini qayta yozish yoki o`zgartish majburiyati bo`lmasligi kk

// Liskov Substitution
bu tamolda esa birorta Parent class yaratsak va uning SubClasini
yaratganimizga u ota classining vazifalarini bekami ko`st bajara olishi kk
o`ziga tegishli bo`lgan metodlardan tashqari

// Interface Segregation
Bilamizki biz interfacelardan abstraction va shablon sifatida foydalanamiz.
Shu aynan shablon sifatida foydalanganimizga
 bitta interfacega juda ko`p shablonlarni yuklab tashlaymiz va class yaratib
 u shablondan foydalanmoqchi bolamiz. lekin hamma hollarda ham interfacedagi
 barcha shablonlar biz uchun zarur bo`lmaydi lekin oddiy
 class majbur bo`ladi hammasini override qilishga. buni qandaydir ma`noda muamm
 deb ataydigan bolsak Bu muammoni hal qilish uchun bizga Interface segregation yordamga keladi
 >>  Bu qanday bo`ladi >> Biz interfacedagi shablonlarni bajarashi kk vbo`lgan vazifasiga qarab guruhlarga ajratamiz
 va kichik kichik interfacelarni yaratamiz. Shundan so`ng qandaydir vazifani bajaradigan claass
 yaratganimizda shu vazifaga mos keladigan interfacedan foydalanamiz natijada bizning oddiy classimiz
 o`zi uchun zarur(kerak) bo`lmagan metod(shablon)ni override qilishi shartmas.

 // Dependensy Inversion

 misol uchun  biz bir klassda amal bajar yabmiz va boshqa bir clasdan shu yerda foydalaishimiz
 kk bo`lib qodi umuman olganda bir nechta classlardan bir vazifada foydalanishimiz kk bo`lib qoldi
  bu holda har  bir class bilan birma bir aloqa qilmaymizDa alohida bir abstract class
  yoki interface orqali bo`g`lanamiz.

  - Yuqori darajali modullar quyi darajali modullarga bog’liq bo’lmasliklari kerak.
  Ikkalasi ham asbtraction ga bog’liq bo’lishi lozim.

- Abstraction detallarga bog’liq bo’lmasligi kerak.
Detallar abstraction ga bog’liq bo’lishi lozim.
