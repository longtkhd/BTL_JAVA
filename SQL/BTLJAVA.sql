create database SOTAYSINHVIEN

create table NGUOIDUNG(
	maNguoidung varchar(20) primary key,
	tenTaiKhoan varchar(50) ,
	tenNguoiDung varchar(50),
	matKhau varchar(50),
	loaiTaiKhoan varchar(50)
)

insert into NGUOIDUNG
values
('nguoidung1','admin','long','admin','admin'),
('nguoidung2','user','User1','1234','user'),
('nguoidung3','user3','use3','12345','user'),
('nguoidung4','user4','user4','12345','user'),
('nguoidung5','user5','user5','12345','user')

create table NGANH(
	maNganh varchar(50) primary key,
	tenNganh nvarchar(50)
)
insert into NGANH
values 
('nganh1',N'Công nghệ thông tin'),
('nganh2',N'Kĩ thuật phần mềm'),
('nganh3',N'Khoa học máy tính'),
('nganh4',N'Du lịch lữ hành'),
('nganh5',N'Tự động hóa')


create table SINHVIEN(
	maSv varchar(50) primary key,	
	hoten nvarchar(50),
	soDt char(10),
	email varchar(50),
	diachiSV nvarchar(50),
	soThich nvarchar(50),
	danToc nvarchar(50),
	tonGiao nvarchar(50),
	gioiTinh nvarchar(50),
	maNguoidung varchar(20),
	foreign key(maNguoidung) references NGUOIDUNG(maNguoidung) on update cascade on delete cascade,
	maNganh varchar(50),
	foreign key (maNganh) references NGANH(maNganh) on update cascade on delete cascade
	)
	

insert into SINHVIEN
values
('2018604774',N'Nguyễn Văn Long','0353792709','longtkhd2709@gmail.com',N'Hải Dương',N'Hát',N'Kinh',N'không','nam','nguoidung1','nganh1'),
('2018604775',N'Phạm Thị Ngân','0988956973','ngan@gmail.com',N'Hải Dương',N'Hat',N'Kinh',N'không','nữ','nguoidung2','nganh2'),
('2018604776',N'Đinh Anh Tuân','0979693626','tuan@gmail.com',N'Hà Nội',N'Hát',N'Kinh',N'không','nam','nguoidung3','nganh3'),
('2018604777',N'Phạm Thị Chí Thức','0836362622','thuc@gmail.com',N'Hà Nam',N'Du lịch',N'kinh',N'không','nữ','nguoidung4','nganh1'),
('2018604778',N'Nguyễn Thị Bích Ngọc','0836362622','ngoc@gmail.com',N'Vĩnh Phúc',N'Múa',N'kinh',N'không','nữ','nguoidung5','nganh3')

create table GIADINH(
	id int primary key ,
	hoTenBo nvarchar(50),
	hoTenMe nvarchar(50),
	soDTNT char(10),
	diaChiBo nvarchar(50),
	diaChiMe nvarchar(50),
	ngheNghiepBo nvarchar(50),
	ngheNghiepMe nvarchar(50),
	hoTenACE nvarchar(50),
	maSv varchar(50),
	foreign key(maSv) references SINHVIEN(maSv) on update cascade on delete cascade
)
insert into GIADINH
values
(1,'Nguyễn Văn A',N'Phạm Thị A','0939294455',N'Hải Dương',N'Hà Nội',N'Trồng Trọt',N'Công Nhân',N'Nguyễn Bảo Ngọc','2018604774'),
(2,'Nguyễn Văn B',N'Phạm Thị B','0939294466',N'Hà Nội',N'Hà Nội',N'Trồng Trọt',N'Bác Sĩ',N'Phạm Thị Lan','2018604775'),
(3,'Nguyễn Văn C',N'Bùi Thị C','0939294475',N'Hà Nam',N'Hà Nam',N'Trồng Trọt',N'Bác Sĩ',N'Phạm Xuân Huy','2018604776'),
(4,'Phạm Xuân D',N'Lê Thị D','0939294375',N'Bắc Ninh',N'Hải Dương',N'Trồng Trọt',N'Công Nhân',N'Đào Minh Thành','2018604777'),
(5,'Phạm Xuân E',N'Lê Thị DE','0939294375',N'Bắc Ninh',N'Hải Dương',N'Trồng Trọt',N'Nông Dân',N'Bùi Hữu Tuấn','2018604778')


create TABLE CTDAOTAO(
	maSo varchar (50) primary key,
	maNganh varchar(50),
	foreign key (maNganh) references NGANH(maNganh) on update cascade on delete cascade,
	khoaHoc varchar(50),
	tenChuongTrinh nvarchar(50),
	trinhDoDaoTao nvarchar(50),
	hinhThucDaoTao nvarchar(50)
)

insert into CTDAOTAO
values
('so3','nganh4','2019','CNTT',N'Cap Đẳng',N'Trắc Nghiệm'),
('so4','nganh3','2019','KTPM',N'Cao Đẳng',N'Trắc Nghiệm'),
('so1','nganh1','2018','KHMT',N'Đại Học',N'Tự Luận'),
('so2','nganh2','2019','HTTT',N'Đại Học',N'Trắc Nghiệm')
create table HOCPHAN (
	maHp varchar(50) primary key,
	tenHp nvarchar(50),
	loaiHp nvarchar(50),
	soTCLT int,
	soTCTH int,
	tonTC int
)

insert into HOCPHAN
values
('hocphan6',N'Cơ Sở Dữ Liệu',N'tự chọn',1,1,2),
('hocphan5',N'Photoshop',N'tự chọn',1,1,2),
('hocphan1',N'Trí Tuệ Nhân Tạo',N'bắt buộc',2,1,3),
('hocphan2',N'Lập Trình Java',N'bắt buộc',2,2,4),
('hocphan3',N'Lập Trình Window',N'bắt buộc',2,2,4),
('hocphan4',N'Kĩ Thuật Lập Trình',N'bắt buộc',2,2,4)



create table HOC (
	ky int,
	maNganh varchar(50),
	foreign key(maNganh) references NGANH(maNganh) on update cascade on delete cascade,
	maHp varchar(50),
	foreign key(maHp) references HOCPHAN(maHp) on update cascade on delete cascade,
	constraint pk_hoc primary key(maNganh,maHp,ky),
	thu nvarchar(50),
	tietBatDau int,
	tietKetThuc int
)

insert into HOC
values
(1,'nganh2','hocphan6',N'hai',7,12),
(4,'nganh1','hocphan5',N'ba',7,10),
(1,'nganh1','hocphan2',N'tư',1,6),
(2,'nganh2','hocphan4',N'năm',1,6),
(3,'nganh3','hocphan3',N'sáu',1,6),
(4,'nganh1','hocphan1',N'bảy',7,12),
(2,'nganh1','hocphan2',N'chủ nhật',7,12)




create table KETQUA (
	maSv varchar(50),
	foreign key(maSv) references SINHVIEN(maSv) on update cascade on delete cascade,
	loaiKt varchar(50),
	maHp varchar(50),
	foreign key(maHp) references HOCPHAN(maHp) on update cascade on delete cascade,
	constraint pk_kq primary key(maSv,maHp,loaiKt),
	diem varchar(50)
)

insert into KETQUA
values
('2018604774','he so 1','hocphan1','8'),
('2018604775','he so 2','hocphan1','7'),
('2018604774','he so 1','hocphan2','6'),
('2018604776','he so 2','hocphan6','4'),
('2018604775','he so 1','hocphan3','4'),
('2018604776','he so 1','hocphan1','4'),
('2018604775','he so 2','hocphan5','4')

select * from SINHVIEN
select * from SINHVIEN
SELECT * FROM CTDAOTAO inner join NGANH on CTDAOTAO.maNganh = NGANH.maNganh where CTDAOTAO.maNganh ='nganh3';
SELECT * FROM HOC inner join HOCPHAN on HOC.maHp = HOCPHAN.maHp WHERE maNganh ='nganh2';
SELECT * FROM HOC inner join HOCPHAN on HOC.maHp = HOCPHAN.maHp WHERE maNganh = 'nganh3'
SELECT * FROM KETQUA inner join HOCPHAN on KETQUA.maHp = HOCPHAN.maHp inner join HOC on HOC.maHp = HOCPHAN.maHp WHERE maSv ='2018604776';
select * from NGANH
SELECT * FROM KETQUA inner join HOCPHAN on KETQUA.maHp = HOCPHAN.maHp inner join HOC on HOC.maHp = HOCPHAN.maHp WHERE maSv ='2018604776';
SELECT * FROM KETQUA inner join HOCPHAN on KETQUA.maHp = HOCPHAN.maHp inner join HOC on HOC.maHp = HOCPHAN.maHp WHERE maSv = '2018604775';
SELECT * FROM SINHVIEN