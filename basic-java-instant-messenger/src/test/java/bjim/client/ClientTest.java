package bjim.client;

import bjim.server.Server;
import org.junit.Test;
import org.mockito.Mock;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;

import java.awt.Window.Type;
import java.awt.dnd.DropTarget;
import java.awt.event.ContainerListener;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.im.InputContext;
import java.awt.image.BufferStrategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.net.Socket;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ClientTest {




	@Test
	public void ClientAppDoNotGetConnectionIfServerAppDonotStarts() throws InterruptedException, IOException {

		// given
		Client client = new Client("127.0.0.1");
		Server server = new Server();

		// when

		Thread.sleep(5000);

		client.startRunning();
		Thread.sleep(5000);
		client.checkconnection();

		// then

		assertEquals(0,client.running());

	}
	}

