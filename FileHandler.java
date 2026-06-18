String id = dis.readUTF();
                String name = dis.readUTF();
                String department = dis.readUTF();
                double gpa = dis.readDouble();

                students.add(
                        new Student(id, name, department, gpa)
                );
            }

        } catch (IOException e) {

            System.out.println("Binary file not found.");
        }

        return students;
    }


    public static void saveSerialized(ArrayList<Student> students) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("data/students.ser"))) {

            oos.writeObject(students);

            System.out.println("Data serialized successfully.");

        } catch (IOException e) {

            System.out.println("Serialization error.");
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Student> loadSerialized() {

        ArrayList<Student> students = new ArrayList<>();

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("data/students.ser"))) {

            students = (ArrayList<Student>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Serialized file not found.");
        }

        return students;
    }


    public static void displayFileProperties(String path) {

        File file = new File(path);

        if (file.exists()) {

            System.out.println("\n===== FILE INFORMATION =====");

            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: "
                    + new Date(file.lastModified()));

        } else {

            System.out.println("File does not exist.");
        }
    }


    public static void backupFile() {

        try (

                BufferedInputStream bis =
                        new BufferedInputStream(
                                new FileInputStream("data/students.dat"));

                BufferedOutputStream bos =
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        "backup/students_backup.dat"))

        ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {

                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("Backup completed successfully.");

        } catch (IOException e) {

            System.out.println("Backup failed.");
        }
    }
}