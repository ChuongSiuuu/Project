/*
package DAO;

import Myconncection.Myconnection;
import Office.Employees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {
    public List<Employees> getAll() {
        final String sql = "SELECT * FROM `Employees`";

        List<Employees> brandList = new ArrayList<>();

        try {
            Connection conn = Myconnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employees b = new Employees();
                b.setId(rs.getInt("id"));
                b.setFull_name(rs.getString("full_name"));
                b.setBirth_date(rs.getString("birth_day"));
                b.setGender(rs.getString("gender"));
                b.setAddress(rs.getString("address"));
                b.setDate_join(rs.getString("datejoin"));
                b.setPhone(rs.getString("phone"));
                b.setEmail(rs.getString("email"));
                b.setSalary(rs.getString("salary"));
                b.setManagerID(rs.getString("manager_id"));
                b.setPosition(rs.getString("pos_id"));
                b.setDept(rs.getString("dept"));
                brandList.add(b);
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return brandList;
    }

    public Employees getById(long id) {
        final String sql = "SELECT * FROM `Employees` WHERE  `id` = " + id;
        Employees b = null;

        try {
            Connection conn = Myconnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                b = new Employees();
                b.setId(rs.getInt("id"));
                b.setFull_name(rs.getString("full_name"));
                b.setBirth_date(rs.getString("birth_day"));
                b.setGender(rs.getString("gender"));
                b.setAddress(rs.getString("address"));
                b.setDate_join(rs.getString("datejoin"));
                b.setPhone(rs.getString("phone"));
                b.setEmail(rs.getString("email"));
                b.setSalary(rs.getString("salary"));
                b.setManagerID(rs.getString("manager_id"));
                b.setPosition(rs.getString("pos_id"));
                b.setDept(rs.getString("dept"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    //////////////////////////////////////
    public List<Product> getAllProductByBrand(long brandID) {
        Brand b = getById(brandID);
        if (b == null) {
            throw new RuntimeException("Hãng không tồn tại!");
        }
        // SQL
        final String sql = "SELECT * FROM `products` WHERE `brand_id` = " + brandID;

        List<Product> productList = new ArrayList<>();
        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getLong("id"));
                p.setName(rs.getString("product_name"));
                p.setColor(rs.getString("product_color"));
                p.setSize(rs.getString("product_size"));
                p.setBrandId(brandID);
                p.setPrice(rs.getLong("product_price"));
                productList.add(p);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }

/////////////////////////////////////////////
public void insert(Employees p) {
    final String sql = String.format("INSERT  INTO `products` VALUES ( NULL,'%s','%d','%s','%s','%d' ) ",
            p.getName(), p.getPrice(), p.getSize(), p.getColor(), p.getBrandId()
    );
    try {
        Connection conn = MyConnection.getConnection();
        Statement stmt = conn.createStatement();
        long rs = stmt.executeUpdate(sql);

        if (rs == 0) {
            System.out.println("Thêm thất bại");
        }

        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void update(Product product, long id) {
        Product tmp = getById(id);
        if (tmp == null) {
            throw new RuntimeException("Sản phẩm không tồn tại!");
        }

        final String sql = String.format("UPDATE `products` SET `product_name`='%s',`product_price`='%d',`product_size`='%s',`product_color`='%s',`brand_id`='%d' WHERE `id` = '%d'",
                product.getName(), product.getPrice(), product.getSize(), product.getColor(), product.getBrandId(), id
        );
        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            long rs = stmt.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Cập nhật thất bại");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void delete(long id) {
        Product product = getById(id);
        if (product == null) {
            throw new RuntimeException("Sản phẩm không tồn tại!");
        }

        final String sql = "DELETE FROM `products` WHERE  `id` = " + id;
        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            long rs = stmt.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Xoá thất bại");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/