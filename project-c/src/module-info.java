module lk.ijse.project_c {

    requires transitive lk.ijse.project_b;
    requires lk.ijse.project_e;

    exports lk.ijse.project_c.repo;
}