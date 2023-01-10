function toggleLightDarkMode() {
   var element = document.body;
   const collection = document.getElementsByTagName("nav")[0].classList.toggle("gradient-custom-dark");
   console.log("Data:- collection  ",collection);
   element.classList.toggle("dark_body");
   document.getElementsByTagName("nav")[0].getElementsByTagName("pre")[0].classList.toggle("navbarFontDarkMode")
}