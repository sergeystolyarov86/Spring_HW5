public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();


        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            Product product= new Product("water",52);
            productDao.save(product);

            System.out.println(productDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shotdown();
        }
    }
}



