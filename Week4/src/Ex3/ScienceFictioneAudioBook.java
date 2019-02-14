package Ex3;

public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioEbook {

	String size;
	int tracks;
	public ScienceFictioneAudioBook(String titlu, String autor, int yearOfPublication, String subject, int tracks, String size) {
		super(titlu, autor, yearOfPublication, subject);
		this.size = size;
		this.tracks = tracks;
	}

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Number of Tracks: "+ tracks);
		System.out.println("Size: "+size);
	}

	@Override
	public int getNumberOfTracks() {
		return tracks;
	}
}
