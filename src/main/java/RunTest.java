import Dreamlove.others.refrigerated;
import Dreamlove.others.sale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class RunTest {
    public static void main(String[] args) throws JAXBException {
        Dreamlove.catalog cat = new Dreamlove.catalog();
        Dreamlove.product prod = new Dreamlove.product();
        prod.setId(28691);
        prod.setPublic_id("D-221989");
        prod.setUpdated("2021-07-21 21:24:35");
        prod.setUnit_of_measurement("units");
        prod.setAvailable(1);
        prod.setCost_price(0.97);
        prod.setPrice(13.21);
        prod.setRecommended_retail_price(13.21);
        prod.setProduct_url("https://store.dreamlove.es/sevencreations-stay-hard-purple-p-1-51-28691");
        prod.setDefault_shipping_cost(10.90);
        prod.setDelivery_desc("2-6 dias");
        prod.setWith_serial_number(0);
        prod.setMin_units_per_order(1);
        prod.setMax_units_per_order(99999999);
        prod.setVat(21.00);
        prod.setTitle("SEVENCREATIONS STAY HARD PURPLE");
        prod.setDescription("SEVENCREATIONS STAY HARD PURPLE");
        prod.setHtml_description("<p>kit of three silicone rings of different size, which adapt to any penis size, with which you will make your erection much more durable, since the rings allow you to delay ejaculation and keep your erect penis much longer.</p><ul>\t<li>The rings can be used separately or combined with each other.</li>\t<li>The size of the rings is 21 mm, 23 mm and 24 mm</li></ul><p>Sevencreations was born in 2002 to satisfy millions of people in the world, the brand established as a solid company manufactures almost 1 million toys a day with a price adapted to audiences of all purchasing powers and people who start in the world of the sex toy.</p>");
        prod.setRelease_date("2021-07-14");
        prod.setPrepaid_reservation(0);
        prod.setDestocking(0);
        prod.setBrand("SEVEN CREATIONS");
        prod.setBrand_hierarchy("SEVEN CREATIONS");

        Dreamlove.others.shipping_weight shipping_weight = new Dreamlove.others.shipping_weight();
        shipping_weight.setWeight(35);
        shipping_weight.setUnit("g");
        prod.setShipping_weight(shipping_weight);

        sale sale = new sale();
        sale.setData("");
        sale.setValue("0");
        prod.setSale(sale);

        Dreamlove.size.size size = new Dreamlove.size.size();
        size.setUnit("mm");
        size.setDepth(10);
        size.setHeight(180);
        size.setWidth(115);
        prod.setSize(size);

        Dreamlove.others.refrigerated refrigerated = new refrigerated();
        refrigerated.setData("");
        refrigerated.setValue("0");
        prod.setRefrigerated(refrigerated);

        Dreamlove.others._new _new = new Dreamlove.others._new();
        _new.setData("");
        _new.setValue("0");
        prod.set_new(_new);

        Dreamlove.barcodes.barcodes barcodes = new Dreamlove.barcodes.barcodes();
        Dreamlove.barcodes.barcode b1 = new Dreamlove.barcodes.barcode();
        b1.setBarcode("4719855241358");
        b1.setType("EAN-13");
        barcodes.addToBarcodes(b1);
        Dreamlove.barcodes.barcode b2 = new Dreamlove.barcodes.barcode();
        b2.setBarcode("4719855241358");
        b2.setType("EAN-13");
        barcodes.addToBarcodes(b2);
        prod.setBarcodes(barcodes);

        Dreamlove.categories.categories categories = new Dreamlove.categories.categories();
        Dreamlove.categories.category category = new Dreamlove.categories.category();
        category.setCategory("XXX toys");
        category.setGesioid(2);
        category.setMaincategory(1);
        category.setRef("Juguetes Sexuaes XXX");
        categories.addToCategories(category);
        prod.setCategories(categories);

        Dreamlove.internationalization.internationalization internationalization = new Dreamlove.internationalization.internationalization();
        Dreamlove.internationalization.title titles = new Dreamlove.internationalization.title();
        titles.setValue("SEVENCREATIONS STAY HARD PURPLE", "en-UK");
        titles.setValue("SEVENCREATIONS SET DE TROIS ANNEAUX PENIS LILAS", "fr-FR");
        internationalization.addToTitle(titles);

        Dreamlove.internationalization.description descriptions = new Dreamlove.internationalization.description();
        descriptions.setDescription("SEVENCREATIONS STAY HARD PURPLE", "en-UK");
        descriptions.setDescription("SEVENCREATIONS RESTER VIOLET DUR", "fr-FR");
        internationalization.addToDescription(descriptions);

        Dreamlove.internationalization.html_description html_description= new Dreamlove.internationalization.html_description();
        html_description.setHtml_description("<p>kit of three silicone rings of different size, which adapt to any penis size, with which you will make your erection much more durable, since the rings allow you to delay ejaculation and keep your erect penis much longer.</p><ul>\t<li>The rings can be used separately or combined with each other.</li>\t<li>The size of the rings is 21 mm, 23 mm and 24 mm</li></ul><p>Sevencreations was born in 2002 to satisfy millions of people in the world, the brand established as a solid company manufactures almost 1 million toys a day with a price adapted to audiences of all purchasing powers and people who start in the world of the sex toy.</p>", "en-UK");
        html_description.setHtml_description("<p> kit de trois anneaux en silicone de diff�rentes tailles, qui s&#39;adaptent � toutes les tailles de p�nis, avec lesquels vous prolongerez consid�rablement votre �rection, puisque les anneaux vous permettent de retarder l&#39;�jaculation et de maintenir votre p�nis en �rection beaucoup plus longtemps. </p><ul><li> Les anneaux peuvent �tre utilis�s s�par�ment ou en combinaison les uns avec les autres. </li><li> La taille des anneaux est de 21 mm, 23 mm et 24 mm </li></ul><p> Sevencreations est n�e en 2002 pour satisfaire des millions de personnes dans le monde, la marque �tablie comme une entreprise solide fabrique pr�s d&#39;1 million de jouets par jour avec un prix adapt� aux publics de tous les pouvoirs d&#39;achat et aux personnes qui commencent dans le monde. du jouet sexuel. </p>", "fr-FR");
        internationalization.addToHtml_description(html_description);

        prod.setInternationalization(internationalization);

        Dreamlove.images.images images = new Dreamlove.images.images();
        Dreamlove.images.image image = new Dreamlove.images.image();
        image.setName("");
        image.setPreferred(0);
        image.setSrc("https://store.dreamlove.es/productos/imagenes/img_81853_ba9dd72cab93c913d059b6988618bfb0_1.jpg");
        images.addToImages(image);
        Dreamlove.images.image image1 = new Dreamlove.images.image();
        image1.setName("");
        image1.setPreferred(1);
        image1.setSrc("https://store.dreamlove.es/productos/imagenes/img_81854_52da567827efe00d6b3a385268337b29_1.jpg");
        images.addToImages(image1);
        prod.setImages(images);

        Dreamlove.stock.stock stock = new Dreamlove.stock.stock();
        Dreamlove.stock.location location = new Dreamlove.stock.location();
        location.setPath("General");
        location.setValue(27);
        stock.addToStock(location);
        Dreamlove.stock.location location1 = new Dreamlove.stock.location();
        location1.setPath("General");
        location1.setValue(27);
        stock.addToStock(location1);
        prod.setStock(stock);

        prod.setHs_intrastat_code("");

        cat.addToCatalog(prod);
        JAXBContext context = JAXBContext.newInstance(Dreamlove.catalog.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(cat, new File("./yee.xml"));
    }
}
