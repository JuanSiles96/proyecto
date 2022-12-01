package com.JuanSiles96.dao;

import com.JuanSiles96.model.Coche;
import com.JuanSiles96.model.Revision;
import com.JuanSiles96.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RevisionDao {
    private Connection connection;

    public RevisionDao() {
        connection = ConectorBD.getConnection();
    }

    public void addRevision(Revision revision){
        try{
            PreparedStatement preparedStatement =connection.prepareStatement(
                    "INSERT INTO revisiones (codigo, frenos, filtro, aceite, matricula) VALUES (?, ?, ?, ?, ?)"
            );
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFrenos());
            preparedStatement.setString(3, revision.getFiltro());
            preparedStatement.setString(4, revision.getAceite());
            preparedStatement.setString(5, revision.getMatricula());
            preparedStatement.executeUpdate();

            System.out.println(revision + " creado");
        } catch (SQLException e){
            System.out.println("Error al crear la revision: " + e.getMessage());
        }
    }

    public void updateRevision (Revision revision){
        try{
            PreparedStatement preparedStatement =connection.prepareStatement(
                    "UPDATE revisiones SET codigo=?, frenos=?, filtro=?, aceite=?, matricula=? WHERE codigo=?"
            );
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFrenos());
            preparedStatement.setString(3, revision.getFiltro());
            preparedStatement.setString(4, revision.getAceite());
            preparedStatement.setString(5, revision.getMatricula());

            preparedStatement.setString(6, revision.getCodigo());
            preparedStatement.executeUpdate();

            System.out.println(revision + " editado");
        } catch (SQLException e){
            System.out.println("Error al crear la revision: " + e.getMessage());
        }
    }

    public void deleteRevision(String codigo){
        try{
            PreparedStatement preparedStatement =connection.prepareStatement(
                    "DELETE FROM revisiones WHERE codigo=?"
            );
            preparedStatement.setString(1, codigo);
            preparedStatement.executeUpdate();

            System.out.println(codigo + " eliminado");
        } catch (SQLException e){
            System.out.println("Error al eliminar la revison: " + e.getMessage());
        }
    }

    public List<Revision> getALLRevision() {
        List<Revision> revisiones = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM revisiones");
            while (resultSet.next()){
                Revision revision = new Revision();
                revision.setCodigo(resultSet.getString("codigo"));
                revision.setFrenos(resultSet.getString("frenos"));
                revision.setFiltro(resultSet.getString("filtro"));
                revision.setAceite(resultSet.getString("aceite"));
                revision.setMatricula(resultSet.getString("matricula"));

                revisiones.add(revision);
            }
        }catch (SQLException e){
            System.out.println("Error al listar las revisiones: " + e.getMessage());
        }

        return revisiones;
    }
}
