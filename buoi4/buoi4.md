BTVN Buổi 4
Bài 1:
Cho một tuple gồm n phần tử kiểu xâu ký tự nhưng các ký tự đều là các con số từ 0 tới
9. Hãy chuyển đổi tuple đó để thu được tuple mới gồm phần tử kiểu số tương ứng.
Tính trung bình cộng các phần tử trong tuple thu được.

Bài 2:
Khởi tạo hai tập hợp (set), trong đó tập A chứa các mã sinh viên đăng ký hoc tiếng
Anh tại bàn tiếp nhận số 1, tập B là các mã sinh viên đăng ký học tại bàn tiếp nhận số
2. In thông tin hai tập hợp lên màn hình.
- Cho biết có sinh viên nào đăng ký học tại cả hai bàn hay không.
- Cho biết danh sách tổng hợp của các sinh viên đã đăng ký của cả hai bàn.
- Cho biết danh sách các sinh viên đã đăng ký tại bàn 1 mà không đăng ký tại bàn
2.

Bài 3:
Bài toán yêu cầu tính tổng mức độ hạnh phúc sau khi xét qua một mảng số nguyên, dựa trên hai tập hợp rời nhau A và B, với các số bạn thích (set A) và không thích (set B). Mỗi lần gặp một phần tử trong mảng:
Nếu phần tử đó thuộc tập A, bạn thêm 1 vào mức độ hạnh phúc.
Nếu phần tử đó thuộc tập B, bạn trừ 1 khỏi mức độ hạnh phúc.
Nếu phần tử đó không thuộc tập A cũng không thuộc tập B, mức độ hạnh phúc không thay đổi.
Định dạng đầu vào:
Dòng đầu tiên chứa các số nguyên n và m được phân tách bằng một khoảng trắng.
Dòng thứ hai chứa n số nguyên, các phần tử của mảng.
Dòng thứ ba và thứ tư chứa m số nguyên, lần lượt là các phần tử của tập hợp A và B.
Định dạng đầu ra:
Xuất ra một số nguyên duy nhất, tổng mức độ hạnh phúc của bạn.
Giải thích:
Bạn có một mảng gồm n số nguyên và hai tập hợp A và B mỗi tập hợp chứa m số nguyên.
Mức độ hạnh phúc bắt đầu từ 0.
Xét từng phần tử trong mảng: nếu thuộc tập A, tăng hạnh phúc lên 1; nếu thuộc tập B, giảm hạnh phúc xuống 1; nếu không thuộc cả hai tập, mức độ hạnh phúc không thay đổi.
Bạn cần tính và in ra tổng mức độ hạnh phúc cuối cùng.
Bài 4:
Viết một chương trình Python để tìm tập hợp con lớn nhất của một set sao cho tổng của các phần tử trong tập hợp con đó không vượt quá một số cho trước. Chương trình sẽ nhận đầu vào là một set có n phần tử (n > 0) và một số nguyên và trả về một set chứa các phần tử của tập hợp con lớn nhất thỏa mãn điều kiện đã nêu
Test:
4
{1, 2, 3, 4}
6



{1, 2, 3}


Bài 5:
Tạo một mảng xâu a chứa n phần tử (mảng mà mỗi phần tử là 1 xâu ký tự nhập từ bàn phím).
- Hãy tạo một tuple b từ mảng a với các phần tử của tuple được lấy lần lượt trong a và in ra màn hình.
- Một phần tử của b được gọi là có dạng số nếu chúng chứa toàn các con số (ví dụ: ‘123’, ‘030’ là dạng số; ‘a13’, ‘hello’ là không phải dạng số). Hãy đếm xem có bao nhiêu phần tử trong b có dạng số.

