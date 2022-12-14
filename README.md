# bookAPI
Đây là một RESTful API đơn giảm cho web ứng dụng web quản lý sách, gồm các tính năng thêm, cập nhật, xoá và thống kê thông tin sách.
---
# Mô tả chi tiết
BookAPI sử dụng MySQL bao gồm database có tên là "bookstore", chỉ có một table là "book". Table "book" gồm các cột : id, title, category, author, publisher, publishYear,
price, amount. Sử dụng Spring data JPA để giao tiếp với cơ sở dữ liệu. BookAPI có các chức năng sau:
<ul>
<li>
  Thêm mới sách : Thêm thông tin sách bằng dữ liệu đầu vào dạng JSON, sử dụng method Post và url cho chức năng này là "/book"
</li>

<li>
	Cập nhật thông tin sách : Cập nhật thông tin sách theo id lấy từ đường dẫn, sử dụng method Put và url cho chức năng này là "/book/{id}",
	nó sẽ lấy id bằng path variable.
</li>
<li>
	Xoá thông tin sách : Xoá thông tin sách theo id dữ liệu truyền vào, sử dụng method Delete và url cho chức năng này là "/book"

</li>
<li>
	Đọc thông tin sách và phân trang : Tổng số sách sẽ được chia thành 1 biến 'totalPage', mỗi trang có 'limit' số sách, số thức tự
	của trang được đánh số 'indẽx'. Khi hiển thị trang, sẽ lấy index và limit bằng path variable, dùng method Get và 
	url "/book?index = index_trang & limit = limit_trang".

</li>
</ul>
---
# Công cụ và Framework
<ul>
<li>
	MySQL
</li>
<li>
	Spring Data JPA
</li>

</ul>

# Các bước chạy ứng dụng
<ul>
<li>
Cài đặt MySQL , nếu máy chưa cài thì có thể tải tại: https://www.mysql.com/downloads/

</li>
<li>
	Trong MySQL workbench , chạy query để tạo các cột và dữ liệu tại file query.txt
</li>
<li>
	Tại IDE, mở application.properties để thay đổi username và password phù hợp với cơ sở 
	dữ liệu tại máy của ban
	
</li>
<li>
	Run application và table book sẽ tự động được tạo . Giờ có thể thực hiện call API. 
</li>
<li>

</li>

</ul>
