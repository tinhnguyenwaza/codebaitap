
        
        var sTT = 1; // biến điếm số thứ tự
        var table = document.getElementById("myTable"); // biến bảng điẻm

      function nhapSinhVien(){  // phương thức lấy thông tin và in ra 
            var name1 = document.getElementById('name').value;
            var diemToan = document.getElementById('diemToan').value;
            var diemLy = document.getElementById('diemLy').value;
            var diemHoa = document.getElementById('diemHoa').value;



         
          function aSinhVien() {
            sinhVien = { // gán giá trị vào đối tượng
                name: name1,
                diemToan: diemToan,
                diemLy: diemLy,
                diemHoa: diemHoa,
              } 
            }
           
          myFunction();
            document.getElementById('name').value = "";  // trả giá trị về bằng " "
            document.getElementById('diemToan').value = "";
            document.getElementById('diemLy').value = "";
            document.getElementById('diemHoa').value = "";
         
        function myFunction() {  // gán giá trị vào bảng 
            
            var row = table.insertRow(-1);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            var cell4 = row.insertCell(3);
            var cell5 = row.insertCell(4);
            var cell6 = row.insertCell(5);
           

            cell1.innerHTML = sTT++;
            cell2.innerHTML = sinhVien.name;
            cell3.innerHTML = sinhVien.diemToan;
            cell4.innerHTML = sinhVien.diemLy;
            cell5.innerHTML = sinhVien.diemHoa;
            cell6.innerHTML = " ";
           
          }
         
         
        }  // cảu phương thức lấy thông tin

      


      function tinhDiemTrungBinh(){  // phương thức tín điểm trung binh
         
        for (var i = 1 ; i < table.rows.length ;i++) {
          var trungBinh = 0;
          for (var j = 2 ; j < 5 ; j++) {
           
            trungBinh += ( parseFloat( table.rows[i].cells[j].innerHTML)) / 3;
            
          }
          table.rows[i].cells[5].innerHTML = trungBinh.toFixed(1);

        }

      }   // phương thức tính điểm trung bình


      
      function hocSinhGioi(){ // phương thức tính tô màu học sinh giỏi
       
        for (var i = 1 ; i < table.rows.length ;i++) {
          var ponit = table.rows[i].cells[5].innerHTML;
          if (ponit >= 8) {
            table.rows[i].style.color = "red";
          }
      }
    }   // phương thức tính tô màu học sinh giỏi



    function max(){  // phương thức tìm điểm trung bình lớn nhất
      var index = 0;
      var max = 0;
      
      for (var i = 1 ; i < table.rows.length ;i++) {

        var ponit = table.rows[i].cells[5].innerHTML;
        
        if (ponit >= max) {
          max = ponit;
          index = i;
          
        }
        
    }
    window.alert("Điểm trung bình lớn nhất là: "
          + table.rows[index].cells[5].innerHTML);
  } //phương thức tìm kiếm học sinh có điểm trung bình lớn nhất


  
  function index(){ // phương thức tìm kiếm sinh viên
    var indx = prompt("Hãy nhập tên học sinh cần tìm kiếm")
    
    for (var i = 1 ; i < table.rows.length ;i++ ) {
      var indxName = table.rows[i].cells[1].innerHTML;
      if (indx == indxName) {
        document.getElementById('myTable1').innerHTML = table.rows[i].innerHTML ;
      } else {
        document.getElementById('myTable1').innerHTML = "không tìm thấy";
      }
    }
    var display = document.getElementById('display');
    display.style.display = "block";

}