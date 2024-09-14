
public class DeliveryApp extends Application {
    private ArrayList<Delivery> deliveries;

    @Override
    public void onCreate() {
        super.onCreate();
        deliveries = new ArrayList<>();
    }

    public void addDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }
}

public class Delivery {
    private String name;
    private String address;
    private String phoneNumber;

    public Delivery(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class DeliveryActivity extends AppCompatActivity {
    private DeliveryApp deliveryApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        deliveryApp = (DeliveryApp) getApplication();

        ListView listView = findViewById(R.id.listView);
        DeliveryAdapter adapter = new DeliveryAdapter(this, deliveryApp.getDeliveries());
        listView.setAdapter(adapter);
    }

    private class DeliveryAdapter extends ArrayAdapter<Delivery> {
        private Context context;
        private ArrayList<Delivery> deliveries;

        public DeliveryAdapter(Context context, ArrayList<Delivery> deliveries) {
            super(context, R.layout.list_item_delivery, deliveries);
            this.context = context;
            this.deliveries = deliveries;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.list_item_delivery, parent, false);

            Delivery delivery = deliveries.get(position);

            TextView nameTextView = view.findViewById(R.id.nameTextView);
            TextView addressTextView = view.findViewById(R.id.addressTextView);
            TextView phoneNumberTextView = view.findViewById(R.id.phoneNumberTextView);

            nameTextView.setText(delivery.getName());
            addressTextView.setText(delivery.getAddress());
            phoneNumberTextView.setText(delivery.getPhoneNumber());

            return view;
        }