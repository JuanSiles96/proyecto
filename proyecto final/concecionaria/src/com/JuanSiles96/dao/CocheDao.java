package com.JuanSiles96.dao;

import com.JuanSiles96.model.Cliente;
import com.JuanSiles96.model.Coche;
import com.JuanSiles96.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.JuanSiles96.model.Cliente;
import com.JuanSiles96.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDao {


        private Connection connection;

        public CocheDao() {
            connection = ConectorBD.getConnection();
        }

        public void addCoche(Coche coche){
            try{
                PreparedStatement preparedStatement =connection.prepareStatement(
                        "INSERT INTO coches (matricula, precio, colores, modelo, marca, nif) VALUES (?, ?, ?, ?, ?, ?)"
                );
                preparedStatement.setString(1, coche.getMatricula());
                preparedStatement.setDouble(2, coche.getPrecio());
                preparedStatement.setString(3, coche.getColor());
                preparedStatement.setString(4, coche.getModelo());
                preparedStatement.setString(5, coche.getMarca());
                preparedStatement.setString(6, coche.getNif());
                preparedStatement.executeUpdate();

                System.out.println(coche + " creado");
            } catch (SQLException e){
                System.out.println("Error al crear el coche: " + e.getMessage());
            }
        }

        public void updateCoche(Coche coche){
            try{
                PreparedStatement preparedStatement =connection.prepareStatement(
                        "UPDATE coches SET matricula=?, precio=?, colores=?, modelo=?, marca=?, nif=? WHERE matricula=?"
                );
                preparedStatement.setString(1, coche.getMatricula());
                preparedStatement.setDouble(2, coche.getPrecio());
                preparedStatement.setString(3, coche.getColor());
                preparedStatement.setString(4, coche.getModelo());
                preparedStatement.setString(5, coche.getMarca());
                preparedStatement.setString(6, coche.getNif());

                preparedStatement.setString(7, coche.getMatricula());
                preparedStatement.executeUpdate();

                System.out.println(coche + " editado");
            } catch (SQLException e){
                System.out.println("Error al crear el coche: " + e.getMessage());
            }
        }

        public void deleteCoche(String matricula){
            try{
                PreparedStatement preparedStatement =connection.prepareStatement(
                        "DELETE FROM coches WHERE matricula=?"
                );
                preparedStatement.setString(1, matricula);
                preparedStatement.executeUpdate();

                System.out.println(matricula + " eliminado");
            } catch (SQLException e){
                System.out.println("Error al eliminar coche: " + e.getMessage());
            }
        }

        public List<Coche> getALLCoche() {
            List<Coche> coches = new ArrayList<>();

            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM coches");
                while (resultSet.next()){
                    Coche coche = new Coche();
                    coche.setMatricula(resultSet.getString("matricula"));
                    coche.setPrecio(resultSet.getDouble("precio"));
                    coche.setColor(resultSet.getString("colores"));
                    coche.setModelo(resultSet.getString("modelo"));
                    coche.setMarca(resultSet.getString("marca"));
                    coche.setNif(resultSet.getString("nif"));

                    coches.add(coche);
                }
            }catch (SQLException e){
                System.out.println("Error al listar los coches: " + e.getMessage());
            }

            return coches;
        }
}
